package dao;

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
	
	public boolean isLogin(String _sID ,String _sPass)
	{
		//SQL文の作成
		//String sql = "SELECT * FROM category ORDER BY code";
		
		boolean bRet =false;
		if(_sID.equals("test") && _sPass.equals("test"))
		{
			bRet = true;
		}
		
		return bRet;
	}
}
