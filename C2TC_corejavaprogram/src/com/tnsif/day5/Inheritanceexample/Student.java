package com.tnsif.day5.Inheritanceexample;

public class Student extends College {
	private int Sid;
	private String sname;
	private String Course;
	
	public Student(String collegeName, String location, int sid, String sname, String course) {
		super(collegeName, location);
		this.Sid = sid;
		this.sname = sname;
		this.Course = course;
	}
	public int getSid() 
	{
		return Sid;
	}
	public void setSid(int sid) {
		this.Sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		this.Course = course;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", sname=" + sname + ", Course=" + Course +  " CollegeName:"+super.getCollegeName()+" location:"+super.getLocation()+ "]" ;
	}
}
	