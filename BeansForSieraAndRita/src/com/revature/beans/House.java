package com.revature.beans;

public class House {

	public House() {	
	}
	
	private int sqFootage;
	private String type;
	private String city;
	
	public House (int sqFootage, String type, String city) {
		this.sqFootage = sqFootage;
		this.type = type;
		this.city = city;
	}
	//getters and setters
	public int getSqFootage() {
		return sqFootage;
	}
	public void setSqFootage(int sqFootage) {
		this.sqFootage = sqFootage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//tostring
	@Override
	public String toString() {
		return "House [sqFootage=" + sqFootage + ", type=" + type + ", city=" + city + "]";
	}
	
	
}
