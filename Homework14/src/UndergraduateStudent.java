import java.sql.Date;

public class UndergraduateStudent extends Student {
	
	String minor;
	
	
	public void register() {

		System.out.println("<<<<<<< Lisans öğrencisi kayıt edildi >>>>>>>");
		
	}
		
	public UndergraduateStudent(int no, String name, int year, String dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor=minor;
		}

	public UndergraduateStudent() {
		super();
	}

	public void study() {
		System.out.println("Lisans öğrencisi arastırma yapıyor");
	}
	
	

}
