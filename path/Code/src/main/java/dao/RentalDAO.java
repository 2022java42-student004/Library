package dao;

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
	public List<RentalBean> ListUserRentalInfo(int _userID)
	{
		List<RentalBean> listRental = new ArrayList<RentalBean>();
		//listRental.add(new RentalBean())
		return null;
	}
}
