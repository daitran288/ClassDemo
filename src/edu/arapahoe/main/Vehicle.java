package edu.arapahoe.main;

public abstract class Vehicle {

	public String name = "My Pony";
	
	public void slowDown() {
		System.out.println("Vehicle is slowing down");
	}
	
	public abstract void moving();
}
