package com.practice.designpatterns.factory;

public class Car extends Vehicle{
	
	private String brand;
	private String model;
	
	public Car(String type, String fuel, String wheels, String brand, String model) {
		super(type, fuel, wheels);
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", type=" + type + ", fuel=" + fuel + ", wheels=" + wheels
				+ "]";
	}
}
