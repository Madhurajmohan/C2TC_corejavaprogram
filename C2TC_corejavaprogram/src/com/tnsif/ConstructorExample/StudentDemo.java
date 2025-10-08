package com.tnsif.ConstructorExample;

public class StudentDemo {

	public static void main(String[] args) {
		Student S1=new Student();
		S1.setSid(101);
		S1.setSname("Madhu");
		System.out.println(S1);
		Student S2=new Student();
		System.out.println(S2);
		Student S3=new Student(100,"Madhu"); //invoke the parameterized constructor
		System.out.println(S3);
		
		

	}

}
