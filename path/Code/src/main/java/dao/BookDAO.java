package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.BookBean;

public class BookDAO {
	private String url = "jdbc:postgresql:sample";
	private String user = "student";
	private String pass = "himitu";

	public BookDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}

	}

	public List<BookBean> findBooks(String[] condition) throws DAOException {
		String sql = "SLECT * FROM stock INNER JOIN inventory ON stock.isbn = inventory.isbn";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {
			List<BookBean> list = new ArrayList<BookBean>();
			while (rs.next()) {

				int book_id = rs.getInt("book_id");
				long isbn = rs.getLong("isbn");
				String title = rs.getString("title");
				int code = rs.getInt("code");
				String author = rs.getNString("author");
				String publisher = rs.getString("publisher");
				String publish_date = rs.getString("publish_date");
				String arrivalDate = rs.getString("arrival_date");
				String discardDate = rs.getString("discard_date");
				String remarks = rs.getString("remarks");

				BookBean bean = new BookBean();
				bean.setbook_id(book_id);
				bean.setIsbn(isbn);
				bean.setTitle(title);
				bean.setCode(code);
				bean.setAuthor(author);
				bean.setPublisher(publisher);
				bean.setPublishDate(publish_date);
				bean.setArrivaldate(arrivalDate);
				bean.setDiscarDate(discardDate);
				bean.setRemarks(remarks);
				list.add(bean);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}
	}

	public List<BookBean> findByStockID(long bookdata) throws DAOException {
		String sql = "SELECT * FROM inventory WHERE isbn =?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);

		) {
			// プレイスホルダの設定
			st.setLong(1, bookdata);
			ResultSet rs = st.executeQuery();

			List<BookBean> list = new ArrayList<BookBean>();
			while (rs.next()) {
				int book_id = rs.getInt("book_id");
				long isbn = rs.getLong("isbn");
				String title = rs.getString("title");
				int code = rs.getInt("code");
				String author = rs.getNString("author");
				String publisher = rs.getString("publisher");
				String publish_date = rs.getString("publish_date");
				String arrivalDate = rs.getString("arrivalDate");
				String discardDate = rs.getString("discardDate");
				String remarks = rs.getString("remarks");

				BookBean bean = new BookBean();
				bean.setbook_id(book_id);
				bean.setIsbn(isbn);
				bean.setTitle(title);
				bean.setCode(code);
				bean.setAuthor(author);
				bean.setPublisher(publisher);
				bean.setPublishDate(publish_date);
				bean.setArrivaldate(arrivalDate);
				bean.setDiscarDate(discardDate);
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
