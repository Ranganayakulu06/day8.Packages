package com.vehicles.app;

import com.vehicles.Car;
import com.vehicles.parts.Engine;
public class CarApp {
	public static void main(String[] args) { 
	
		Car car = new Car();
		car.setBrand("benzz");
		car.setModel("SV Model");
		car.setPrice(800000);
		
		Engine engine = new Engine();
		engine.setEngineType("Diesel");
		engine.setHorsepower(500);
		
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getPrice());
		System.out.println();
		System.out.println(engine.getEngineType());
		System.out.println(engine.getHorsepower());
		
	}
		
}
