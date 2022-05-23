package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.StockBean;

public class StockDAO {
	private String url = "jdbc:postgresql:sample";
	private String user = "student";
	private String pass = "himitu";

	public StockDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}

	}

	public List<StockBean> findBooks(ArrayList<String> condition) throws DAOException {
		String sql = "SELECT book_id, isbn, title, TO_CHAR(arrival_date, 'YYYY/MM/DD') AS arrival_date, TO_CHAR(discard_date, 'YYYY/MM/DD') AS discard_date, remarks FROM stock WHERE book_id IN ("
				+ String.join(",", condition) + ")";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {
			List<StockBean> list = new ArrayList<StockBean>();
			while (rs.next()) {
				int book_id = rs.getInt("book_id");
				long ibsn = rs.getLong("isbn");
				String title = rs.getString("title");
				String arrival_date = rs.getString("arrival_date");
				String discard_date = rs.getString("discard_date");
				String remarks = rs.getString("remarks");
				StockBean bean = new StockBean();
				bean.setBook_id(book_id);
				bean.setIsbn(ibsn);
				bean.setTitle(title);
				bean.setArrival_date(arrival_date);
				bean.setDiscar_date(discard_date);
				bean.setRemarks(remarks);
				list.add(bean);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}
	}

	public String fixedDate(int book_id) throws DAOException {
		String sql = "SELECT book_id FROM stock WHERE arrival_date + interval '30 day ' <= current_date AND book_id =? ";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, book_id);
			try (ResultSet rs = st.executeQuery();) {
				int type = 0;
				String new_lend_date = "";
				String old_lend_date = "";
				String fixedDate;
				while (rs.next()) {
					type = rs.getInt("type");
					old_lend_date = rs.getString("old_lend_date");
					new_lend_date = rs.getString("new_lend_date");
				}
				if (type == 1) {
					fixedDate = new_lend_date;
				} else {
					fixedDate = old_lend_date;
				}
				return fixedDate;
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException("レコードの取得に失敗しました。");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}
	}
}