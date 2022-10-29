package com.practice.designpatterns.factory;

public class Vehicle {
	public String type;
	public String fuel;
	public String wheels;

	public Vehicle(String type, String fuel, String wheels) {
		super();
		this.type = type;
		this.fuel = fuel;
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
}
