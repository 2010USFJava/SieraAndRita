package com.revature.beans;

public class Furniture {
public Furniture() {
	
}
private String style;
private String purpose;
private double price;

public Furniture(String style, String purpose, double price) {
	this.style = style;
	this.purpose = purpose;
	this.price = price;
}
//getters and setters

public String getStyle() {
	return style;
}

public void setStyle(String style) {
	this.style = style;
}

public String getPurpose() {
	return purpose;
}

public void setPurpose(String purpose) {
	this.purpose = purpose;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Furniture [style=" + style + ", purpose=" + purpose + ", price=$" + price + "]";
}

//tostring


}
