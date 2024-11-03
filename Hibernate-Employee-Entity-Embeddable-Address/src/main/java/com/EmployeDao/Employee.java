package com.EmployeDao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_table")
public class Employee {
	@Id
	private int eId;
	private String eName;
	private Address eLoc;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Address geteLoc() {
		return eLoc;
	}
	public void seteLoc(Address eLoc) {
		this.eLoc = eLoc;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eLoc=" + eLoc + "]";
	}
	
	
	

}
