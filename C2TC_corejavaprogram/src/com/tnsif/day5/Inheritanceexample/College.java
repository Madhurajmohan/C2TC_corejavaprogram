package com.tnsif.day5.Inheritanceexample;

public class College {
	private String CollegeName;
	private String Location;
	
	public College(String collegeName, String location) {
	
		CollegeName = collegeName;
		Location = location;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + ", Location=" + Location + "]";
	}
}