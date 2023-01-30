package homework14;

import java.util.Date;

public class VocationalStudent extends Student{
	
	public VocationalStudent() {
		super();
	}
	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}
	
	
	public void study() {
		
	}
	
	@Override
	public void register() {
		
	}
	
	public String toString() {
		return "VocationalStudent [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob 
				+ ", major=" + major + "]";
	}

}
