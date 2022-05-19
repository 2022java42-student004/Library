package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class TopLoginDAO{
	//URL、ユーザ名、パスワード準備
	private String url = "jdbc:postgresql:sample";
	private String user ="student";
	private String pass ="himitu";
	
	public TopLoginDAO() throws DAOException
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
	
	public boolean isLogin(String _sID ,String _sPass)throws DAOException
	{
		//SQL文の作成
		String sql = "SELECT * FROM manager_id WHERE manager_id = ? & password = ?";
		
		try {
			Connection con = DriverManager.getConnection(url);
		}catch(DAOException e) {
			
		}
		
		boolean bRet =false;
		if(_sID.equals("test") && _sPass.equals("test"))
		{
			bRet = true;
		}
		
		return bRet;
	}
}
