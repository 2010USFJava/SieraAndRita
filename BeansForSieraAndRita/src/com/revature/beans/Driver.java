package com.revature.beans;

public class Driver {
	public static void main (String[] args) {
		House myHouse = new House(5000, "Colonial", "Chicago");
		Furniture myChair = new Furniture("Modern", "Chair for sitting", 300.00);
		System.out.println(myHouse);
		System.out.println(myChair);
}
}
