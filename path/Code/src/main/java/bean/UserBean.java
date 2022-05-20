package bean;

import java.io.Serializable;
import java.util.Date;

public class UserBean implements Serializable{
	private int iID;
	private String strName;
	private long post_no;
	private String address;
	private String tel;
	private String mail;
	private Date birthday;
	private Date join_date;
	private Date secode_date;
	private Date update_date;
	
	public UserBean() {};
	public UserBean(int _iID, String _strName,long _post_no,String _address, String _tel, String _mail,Date _birthday) 
	{
		this.iID = _iID;
		this.strName = _strName;
		this.post_no = _post_no;
		this.address = _address;
		this.tel = _tel;
		this.mail = _mail;
		this.birthday = _birthday;
		join_date = new Date();
	};
	
	
	public int getiID() {return iID;}
	public void setiID(int iID) {this.iID = iID;}
	
	public String getStrName() {return strName;}
	public void setStrName(String strName) {this.strName = strName;}
	
	public long getPost_no() {return post_no;}
	public void setPost_no(long post_no) {this.post_no = post_no;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
	
	public String getMail() {return mail;}
	public void setMail(String mail) {this.mail = mail;}
	
	public Date getBirthday() {return birthday;}
	public void setBirthday(Date birthday) {this.birthday = birthday;}
	
	public Date getJoin_date() {return join_date;}
	public void setJoin_date(Date join_date) {this.join_date = join_date;}
	
	public Date getSecode_date() {return secode_date;}
	public void setSecode_date(Date secode_date) {this.secode_date = secode_date;}
	
	public Date getUpdate_date() {return update_date;}
	public void setUpdate_date(Date update_date) {this.update_date = update_date;}
	
	
}
