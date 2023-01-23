import java.sql.Date;

public class MasterStudent extends GraduateStudent{

	public MasterStudent() {
		super();
		
	}

	public MasterStudent(int no, String name, int year, String dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		
	}

	public void register() {
		System.out.println("<<<<<<< Yüksek Lisans öğrencisi kayıt edildi >>>>>>");
	}

	public void study() {
		System.out.println("Yüksek Lisans öğrencisi arastırma yapıyor");
	}

	public void writeThesis() {
		System.out.println("Yüksek Lisans öğrencisi tez yaziyor");
	}

	public void meetWhitAdvisor() {
		System.out.println("Yüksek Lisans öğrencisi tez danışmanıyla bulusuyor");
	}
	
	

	
}
