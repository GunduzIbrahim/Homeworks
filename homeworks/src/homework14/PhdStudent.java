package homework14;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
	
	boolean qualifyingExamTaken;
	
	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, 
						boolean qualifyingExamTaken ) {
		super(no, name, year, dob, major, advisor);
		this.qualifyingExamTaken=qualifyingExamTaken;
	}

	@Override
	public void study(){
		
	}
	
	@Override
	public void register(){
		
	}
	
	@Override
	public void writeThesis() {
		
	}
	
	@Override
	public void meetWithAdvisor() {
		
	}
	
	public void writePaper() {
		
	}
}
