package bean;

import java.io.Serializable;
import java.sql.Date;

public class RentalBean implements Serializable{
	private int iRentalID;
	private int iUserID;
	private int iBookID;
	private Date dRentalDate;
	private Date dFixedDate;
	private Date dReturnDate;
	private String strRemarks;
	
	RentalBean(){}
	RentalBean(int _iRenatalID,int _iUserID, int _iBookID,Date _dRentalDate,Date _dFixedDate, String _strRemarks)
	{
		iRentalID = _iRenatalID;
		iUserID = _iUserID;
		iBookID = _iBookID;
		dRentalDate = _dRentalDate;
		dFixedDate = _dFixedDate;
		strRemarks = _strRemarks;
	}
	RentalBean(int _iRenatalID,int _iUserID, int _iBookID,Date _dRentalDate,Date _dFixedDate)
	{
		iRentalID = _iRenatalID;
		iUserID = _iUserID;
		iBookID = _iBookID;
		dRentalDate = _dRentalDate;
		dFixedDate = _dFixedDate;
	}
	
	public int getiRentalID() {return iRentalID;}
	public void setiRentalID(int iRentalID) {this.iRentalID = iRentalID;}
	
	public int getiUserID() {return iUserID;}
	public void setiUserID(int iUserID) { this.iUserID = iUserID;}
	
	public int getiBookID() {return iBookID;}
	public void setiBookID(int iBookID) {this.iBookID = iBookID;}
	
	public Date getdRentalDate() {return dRentalDate;}
	public void setdRentalDate(Date dRentalDate) {this.dRentalDate = dRentalDate;}
	
	public Date getdFixedDate() {return dFixedDate;}
	public void setdFixedDate(Date dFixedDate) {this.dFixedDate = dFixedDate;}
	
	public Date getdReturnDate() {return dReturnDate;}
	public void setdReturnDate(Date dReturnDate) {this.dReturnDate = dReturnDate;}
	
	public String getStrRemarks() {return strRemarks;}
	public void setStrRemarks(String strRemarks) {this.strRemarks = strRemarks;}
	
	
}
