package homework14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
			
		Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(simdikiZaman));
        String duzTar = df.format(simdikiZaman);
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(duzTar);
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        Date date2=formatter1.parse(duzTar); 
		
	        Student student1 = new VocationalStudent(1234, "Ibrahim", 2001, date2, "Computer Software");
	        Student student2 = new VocationalStudent();
	        RegistrationOffice newStudent = new RegistrationOffice();
	        newStudent.registerStudent(student1);
	        student2.no = 1200;
	        student2.name = "Mehmet";
	        student2.year = 2020;
	        student2.dob = simdikiZaman;
	        student2.major = "Engineer";
	        newStudent.registerStudent(student2);
	}
}
