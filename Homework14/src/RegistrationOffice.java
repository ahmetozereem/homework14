import java.sql.Date;

public class RegistrationOffice extends Student {

	public RegistrationOffice(int no, String name, int year, String dob, String major) {
		super(no, name, year, dob, major);
		
	}
	
	public RegistrationOffice() {
		super();
		
	}
	
	public Student getAStudent (Student student) {
		return student;
		
	}
	
	

	public void register() {
		System.out.println("<<<<<<< Ögrenci kayıt ofisinde kayıt edildi >>>>>>>>");
		
	}

}
