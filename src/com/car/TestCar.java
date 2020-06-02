package com.car;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car(true, 4);
		System.out.println(
		c.drive()+""+
		c.drive()+""+
		c.drive()+" "+
		c.reverse()+" "+
		c.drive()
		);
		
		System.out.println(c.isStart());
		System.out.println(c.getFule());
		
	}

}
