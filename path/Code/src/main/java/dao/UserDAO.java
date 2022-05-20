package dao;

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
	public UserBean GetMenber(String _strMail)
	{
		UserBean retBean = null;
		
		if(_strMail.equals("aaa@docomo.co.jp"))
		{
			retBean = new UserBean(1,"あああ",1600003L,"東京都千代田区千代田1-1","01200002222","aaa@docomo.co.jp,",new Date());
		}
		
		return retBean;
	}
	

}
