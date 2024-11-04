package com.hibernate.fetch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hibernatecache.dao.Product;
@Entity
@Table
public class Customer {
	@Id
	private int cId;
	private String cName;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Product>  p;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Product>  getP() {
		return p;
	}
	public void setP(List<Product> p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", p=" + p + "]";
	}
	

}
