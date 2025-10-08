package com.tnsif.day6Assignment;

public class Teacher extends Person {
	private int sid;
	private String designation;
	private String session;
	public int getSid() {
		return sid;
	}
	public Teacher(String name, int age, String city, int sid, String designation, String session) {
		super(name, age, city);
		this.sid = sid;
		this.designation = designation;
		this.session = session;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "Teacher [sid=" + sid + ", designation=" + designation + ", session=" + session + "]";
	}
}