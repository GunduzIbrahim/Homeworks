package homework14;

import java.util.Date;

public class UndergraduateStudent extends Student{
	
	String minor;
	
	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
	}

	public void study() {
		
	}

	public void register() {
		
	}

	public String toString() {
		return "UndergraduateStudent [minor=" + minor + ", no=" + no + ", name=" + name + ", year=" 
				+ year + ", dob=" + dob + ", major=" + major + ", toString()=" + super.toString() 
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
