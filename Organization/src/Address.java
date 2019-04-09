package com.capgemini.spring.organization;

public class Address {
	
	private String doorNumber;
	private String street;
	private String cityName;
	private String state;
	private int pincode;
	public Address() {
		super();
	}
	public Address(String doorNumber, String street, String cityName, String state, int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.cityName = cityName;
		this.state = state;
		this.pincode = pincode;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "doorNumber=" + doorNumber + ", Street=" + street + ", CityName=" + cityName + ", State="
				+ state + ", pincode=" + pincode;
	}
	

}
