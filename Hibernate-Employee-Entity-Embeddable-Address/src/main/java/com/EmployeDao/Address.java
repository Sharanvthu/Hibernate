package com.EmployeDao;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String village_name;
	private String taluq_name;
	private String district_name;
	
	
	@Override
	public String toString() {
		return "Address [village_name=" + village_name + ", taluq_name=" + taluq_name + ", district_name="
				+ district_name + "]";
	}
	
	
	public String getVillage_name() {
		return village_name;
	}
	public void setVillage_name(String village_name) {
		this.village_name = village_name;
	}
	public String getTaluq_name() {
		return taluq_name;
	}
	public void setTaluq_name(String taluq_name) {
		this.taluq_name = taluq_name;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	

}
