package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1= new Customer();
		c1.setId(101);
		c1.setCname("Madhu");
		c1.setCity("villupuram");
		System.out.println(c1);
		
		Customer c2= new Customer();
		c2.setId(102);
		c2.setCname("jayanthi");
		c2.setCity("puducherry");
		
		System.out.println(c2);

	}

}