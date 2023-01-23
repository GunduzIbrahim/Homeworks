package homework14;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new VocationalStudent(1234, "Ibrahim", 2001, null, "Computer Software");
		RegistrationOffice newStudent = new RegistrationOffice();
		newStudent.registerStudent(student1);

	}
	

}
