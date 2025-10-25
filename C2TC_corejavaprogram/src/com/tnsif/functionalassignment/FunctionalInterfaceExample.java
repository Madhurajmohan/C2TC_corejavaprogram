package com.tnsif.functionalassignment;

public class FunctionalInterfaceExample {
	 public static void main(String[] args) {

	        // Lambda Expression implementation of Message interface
	        Message m = msg ->  "Hello, " + msg + "!";

	        // Calling the method
	        System.out.println(m.greetings("World"));
	        System.out.println(m.greetings("Java Learners"));
	    }
}
