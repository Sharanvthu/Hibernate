package com.LibraryDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Comics_Books")
public class Comics {

	@Id
	@Column(name = "Book_Name")
	private String bName;
	@Column(name = "Book_Price")
//	@Transient
	private float bPrice;
	@Column(name = "Book_Author")
	private String bAuthor;
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	@Override
	public String toString() {
		return "Comics [bName=" + bName + ", bPrice=" + bPrice + ", bAuthor=" + bAuthor + "]";
	}
	
	
}
