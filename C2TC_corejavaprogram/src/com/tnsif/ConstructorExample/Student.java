package com.tnsif.ConstructorExample;

public class Student {
	private int sid;
	private String sname;
	// default constructor
	public Student()
	{
		this.sid=100;
		this.sname="IFET student";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
}