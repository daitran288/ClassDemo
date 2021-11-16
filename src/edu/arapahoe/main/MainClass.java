package edu.arapahoe.main;

// Concrete classes
public class MainClass{
	public static void main(String[] args) {	

		Boat myBoat = new Boat();
		driving(myBoat);
		
		Car myCar = new Car();
		driving(myCar);
		
		MuscleCar myMuscleCar = new MuscleCar();
		driving(myMuscleCar);
		
		Airplane myAirplane = new Airplane();
		driving(myAirplane);
		
	}
	
	public static void driving(Vehicle vehicle) {
		vehicle.moving();
	}
}