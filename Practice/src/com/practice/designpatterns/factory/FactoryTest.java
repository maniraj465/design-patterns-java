package com.practice.designpatterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle("Car", "Petrol", "Four", "BMW", "BMW 3 Series");
		System.out.println(car);
		Vehicle bike = VehicleFactory.getVehicle("Bike", "Petrol", "Two", "TVS", "Apache RTR 160 4v");
		System.out.println(bike);

	}

}
