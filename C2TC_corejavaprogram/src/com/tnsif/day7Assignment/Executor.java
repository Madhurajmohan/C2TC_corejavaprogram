package com.tnsif.day7Assignment;

public class Executor {
	public static void main(String[] args) {
		//create objects
		Shopping food = new FoodCourt();
		Shopping electronic = new Electronics();
		// Call the order() method
		food.order();
		electronic.order();
	}

}
