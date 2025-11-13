package com.tnsif.dayfifteen.userdefinedobjects.comparableandcomparator;

public class Studentt {private int rollNo;
private String name;
private float per;

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getPer() {
	return per;
}

public void setPer(float per) {
	this.per = per;
}

public Studentt(int rollNo, String name, float per) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.per = per;
}

public Studentt() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
}

}
