package homework14;

import java.util.Date;

public abstract class Student {
	
	int no;
	String name;
	int year;
	Date dob;
	String major;
	
	public Student(int no, String name, int year, Date dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	
	public void study() {
		
	}
	public abstract void register();

	
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob 
				+ ", major=" + major + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() 
				+ ", toString()=" + super.toString()+ "]";
	}
}
