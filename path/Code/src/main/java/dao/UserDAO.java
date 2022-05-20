package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import bean.UserBean;

public class UserDAO {
	//URL、ユーザ名、パスワード準備
	private String url = "jdbc:postgresql:sample";
	private String user ="student";
	private String pass ="himitu";
	
	public UserDAO() throws DAOException
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
	
	//会員を取得する
	public UserBean GetMenber(String _strMail) throws DAOException
	{
		UserBean retBean = null;
		String sql = "SELECT * FROM user_table WHERE mail = ?";
		
		try (
				Connection con = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps = con.prepareStatement(sql);){
				ps.setString(1, _strMail);
				
				try {
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						retBean = new UserBean(rs.getInt("user_id"),rs.getString("name"),
								rs.getLong("post_no"),rs.getString("address"),rs.getString("tel"),
								rs.getString("mail"),rs.getDate("birthday"));
						retBean.setSecode_date(rs.getDate("secede_date"));
						retBean.setSecode_date(rs.getDate("update_date"));
					}
				}catch(SQLException e) {
					e.printStackTrace();
					throw new DAOException("エラー");
				}
			}catch(SQLException e) {
				e.printStackTrace();
				throw new DAOException("エラー");
			}
		
		if(_strMail.equals("aaa@docomo.co.jp"))
		{
			retBean = new UserBean(1,"あああ",1600003L,"東京都千代田区千代田1-1","01200002222","aaa@docomo.co.jp,",new Date());
		}
		
		return retBean;
	}
	

}
