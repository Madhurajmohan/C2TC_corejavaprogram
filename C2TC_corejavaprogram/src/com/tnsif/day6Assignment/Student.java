package com.tnsif.day6Assignment;

public class Student extends Person {
	private int sid;
	private String course;
	public int getSid() {
		return sid;
	}
	public Student(String name, int age, String city, int sid, String course) {
		super(name, age, city);
		this.sid = sid;
		this.course = course;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", course=" + course + "]";
	}
	
}
