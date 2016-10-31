package com.tutorial.SIMRide;

public class Bike {
	
	int id;
	String name;
	int price;
	boolean isAvailable;
	
	public Bike(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.isAvailable = true;
	}
	
	public void Hired()
	{
		isAvailable = false;
	}
}
