package homework14;

import java.util.Date;

public class GraduateStudent extends Student {
	String advisor;
	String thesis;
	
	public GraduateStudent(int no, String name, int year, Date dob, String major,String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor=advisor;
		this.thesis=thesis;
	}

	public void study() {
		
	}

	public void register() {
		
	}
	
	public void writeThesis() {
		
	}
	
	public void meetWithAdvisor() {
		
	}
}
