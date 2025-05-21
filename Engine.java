package com.vehicles.parts;

public class Engine {
	private String engineType;
	private int horsepower;
	 
	 public void setEngineType(String engineType) {
		 this.engineType = engineType;
	 }
	 
	 public void setHorsepower(int horsepower) {
		 this.horsepower = horsepower;
	 }
	 
	 public String getEngineType() {
		 return engineType;
	 }
	 
	 public int getHorsepower() {
		 return horsepower;
	 }
	 
	
	 public void showEngineDetails() {
		 System.out.println("Engine Type is: " + engineType);
		 System.out.println("Horse Power is: " + horsepower);
}
	 
}
