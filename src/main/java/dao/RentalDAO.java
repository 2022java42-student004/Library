package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.RentalBean;

public class RentalDAO {
	//URL、ユーザ名、パスワード準備
	private String url = "jdbc:postgresql:sample";
	private String user ="student";
	private String pass ="himitu";
	
	public RentalDAO() throws DAOException
	{
		try 
		{
			//JDBCドライバの登録
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}
	
	//貸出情報を取得
	public List<RentalBean> ListUserRentalInfo(int _userID)throws DAOException
	{
		List<RentalBean> listRental = new ArrayList<RentalBean>();
		//listRental.add(new RentalBean())
		String sql = "SELECT * FROM rental WHERE user_id = ? AND return_date IS NULL";
		
		try (
				Connection con = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps = con.prepareStatement(sql);){
				ps.setInt(1, _userID);
				
				try {
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						listRental.add(new RentalBean(rs.getInt("rental_id"),rs.getInt("user_id"),rs.getInt("book_id"),
								rs.getDate("rental_date"),rs.getDate("fixed_date"),rs.getDate("return_date"),rs.getString("remarks")));
					}
				}catch(SQLException e) {
					e.printStackTrace();
					throw new DAOException("エラー");
				}
			}catch(SQLException e) {
				e.printStackTrace();
				throw new DAOException("エラー");
			}
		
		return listRental;
	}
}
