import java.sql.Date;

public class GraduateStudent extends Student{
	
	String advisor;
	String thesis;
	
	public void register() {
		
		System.out.println("<<<<<<< Yüksek Lisans ve doktora öğrencisi kayıt edildi >>>>>>>");
		
	}
	public GraduateStudent(int no, String name, int year, String dob, String major,String advisor,String thesis  ) {
		super(no, name, year, dob, major);
		this.advisor=advisor;
		this.thesis=thesis;
	}
	
	
	public void study() {

		System.out.println("Öğrenci (YL yada PhD) arastırma yapıyor");
	}
	
	public void writeThesis() {
		System.out.println("Öğrenci (YL yada PhD) tez yaziyor");
	}
	
	public void meetWhitAdvisor() {
		System.out.println("Öğrenci (YL yada PhD) tez danışmanıyla bulusuyor");
	}
	public GraduateStudent() {
		super();
	}

}
