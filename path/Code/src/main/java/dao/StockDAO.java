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

	public StockDAO () throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	
	}
	public List<StockBean> findBooks(String[] condition) throws DAOException {
		String sql = "SELECT book_id, isbn, title, TO_CHAR(arrival_date, 'YYYY/MM/DD') AS arrival_date, TO_CHAR(discard_date, 'YYYY/MM/DD') AS discard_date, remarks FROM stock WHERE book_id IN (" + String.join(",",condition) + ")";
		try (
				Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {
				List<StockBean> list = new ArrayList<StockBean>();
				while (rs.next()) {
					int book_id = rs.getInt("book_id");
					long ibsn = rs.getLong("ibsn");
					String title = rs.getString("title");
					String arrival_date = rs.getNString("arrival_date");
					String discard_date = rs.getString("discard_date");
					String remarks = rs.getString("remarks");
					StockBean bean = new StockBean();
					bean.setBookId(book_id);
					bean.setIsbn(ibsn);
					bean.setTitle(title);
					bean.setArrivaldate(arrival_date);
					bean.setDiscarDate(discard_date);
					bean.setRemarks(remarks);
					list.add(bean);
				}
				return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}
	}
	
}
