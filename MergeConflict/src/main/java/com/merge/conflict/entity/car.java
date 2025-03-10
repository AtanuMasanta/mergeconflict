package com.merge.conflict.entity;

public class car {

	String carName;
	String makerCompany;
	
	public car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public car(String carName, String makerCompany) {
		super();
		this.carName = carName;
		this.makerCompany = makerCompany;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getMakerCompany() {
		return makerCompany;
	}

	public void setMakerCompany(String makerCompany) {
		this.makerCompany = makerCompany;
	}

	@Override
	public String toString() {
		return "car [carName=" + carName + ", makerCompany=" + makerCompany + "]";
	}
	
	
	
}
