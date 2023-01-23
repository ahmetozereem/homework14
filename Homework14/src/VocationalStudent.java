import java.sql.Date;

public class VocationalStudent extends Student {

	
	
	
	public void register() {
		
		System.out.println("<<<<<<< Misafir Ögrenci kayıt edildi >>>>>>>>");
		
	}

	public VocationalStudent(int no, String name, int year, String dob, String major) {
		super(no, name, year, dob, major);
		
	}

	public VocationalStudent() {
		super();
		
	}
	
	

}
