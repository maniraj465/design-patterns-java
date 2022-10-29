package com.practice.designpatterns.factory;

public class VehicleFactory {
	
	public static Vehicle getVehicle(String type, String fuel, String wheels, String brand, String model) {
		if(type.equalsIgnoreCase("Bike")) return new Bike(type,fuel, wheels, brand, model);
		else if(type.equalsIgnoreCase("Car")) return new Car(type,fuel, wheels, brand, model);
		return null;
	}
}
