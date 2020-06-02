
/*
 * Purpose : To design a car	
 * 
 * Important problem* Cars can be started, driven, reversed or stopped. You have to start the car to drive/reverse/stop it.
 * When car is being driven / reversed, the fuel reduces. Once the car has no fuel, the car stops. Every car has a name.
 * Write a tester class to test cars. How to know whether the car has started and then only being asked to be driven? Try
 * to design on paper first and then see the below design. Understand how state can impact behaviour
 * 
 * This design perform the following : 
 * 	->start()
 *  ->drive()
 *  ->reverse()
 *  ->stop()
 *  
 * */

package com.car;

public class Car {
	
	private boolean start;
	private int fule;
	
	
	public Car(boolean start,int fule) {
	
		this.setFule(fule);
		this.start=start;
	}
	
	
	public String drive() {
		
		
		if(checkFule())
			return "No fule please refule the car";
		this.fule--;
		return " car moving  ";
	}
	
	
	public String reverse() {
		
		if(checkFule())
			return"No fule please refule the car";
		this.fule--;
		return "car moving reverse";
	}
	
	//================================================================================(checkFule())
	/*
	 * This is private method check for if fule is empty or not.
	 * return true if empty false if not empty
	 * 
	 * */
	private boolean checkFule() {
		
		if(this.fule <= 0) {
			
			this.start = false;
			return true;
		}
		return false;
	}
	
	
	//===========================================================================(Setters and getters)
	
	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		this.start = start;
	}
	public double getFule() {
		return fule;
	}
	public void setFule(int fule) {
		if (fule<0)
			throw new IllegalArgumentException("Fule cannot be Negative");
		this.fule = fule;
	}
	
	  
	
}
