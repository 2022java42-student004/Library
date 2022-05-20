package bean;

import java.io.Serializable;

public class StockBean implements Serializable {
	int bookId;
	long isbn;
	String title;
	String arrivaldate;
	String discarDate;
	String remarks;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	public String getDiscarDate() {
		return discarDate;
	}
	public void setDiscarDate(String discarDate) {
		this.discarDate = discarDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
