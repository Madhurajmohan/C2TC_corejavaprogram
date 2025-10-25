package com.tnsif.dayeight.interfaces.instanceofinterface;

public class jio implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}