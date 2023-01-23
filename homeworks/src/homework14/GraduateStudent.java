package homework14;

import java.util.Date;

public class GraduateStudent extends Student {
	String advisor;
	String thesis;
	
	public GraduateStudent(int no, String name, int year, Date dob, String major,String advisor) {
		super(no, name, year, dob, major);
		this.advisor=advisor;
		
	}
	
	@Override
	public void study() {
		
	}
	
	@Override
	public void register() {
		
	}
	
	public void writeThesis() {
		
	}
	
	public void meetWithAdvisor() {
		
	}
}
