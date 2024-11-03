package com.RelationsDao_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Laptop {
	@Id
	private int lid;
	private double lprice;
	private String lBrand;
	@OneToOne
	private Student stud;
	
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public double getLprice() {
		return lprice;
	}
	public void setLprice(double lprice) {
		this.lprice = lprice;
	}
	public String getlBrand() {
		return lBrand;
	}
	public void setlBrand(String lBrand) {
		this.lBrand = lBrand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lprice=" + lprice + ", lBrand=" + lBrand + "]";
	}
	
	

}
