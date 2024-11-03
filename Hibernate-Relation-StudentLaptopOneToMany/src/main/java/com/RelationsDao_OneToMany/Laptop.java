package com.RelationsDao_OneToMany;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Embeddable
@Table(name = "laptopmanytoone")
public class Laptop {
	@Id
	private int lid;
	private double lprice;
	private String lBrand;
	@ManyToOne
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
