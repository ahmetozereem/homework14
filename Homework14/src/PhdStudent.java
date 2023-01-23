import java.sql.Date;

public class PhdStudent extends GraduateStudent {
	
	boolean qualifyingExamTaken;

	public PhdStudent() {
		super();
		
	}

	public PhdStudent(int no, String name, int year, String dob, String major, String advisor, String thesis,boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
		
	}
	
	public void register() {
		System.out.println("<<<<<<< Doktora öğrencisi kayıt edildi >>>>>>>");
	}

	public void study() {
		System.out.println("Doktora öğrencisi arastırma yapıyor");
	}

	public void writeThesis() {
		System.out.println("Doktora öğrencisi tez yaziyor");
	}

	public void meetWhitAdvisor() {
		System.out.println("Doktora öğrencisi tez danışmanıyla bulusuyor");
	}
	
	public void writePaper () {
		System.out.println("Doktora öğrencisi makale yaziyor");
		
	}
	
	

}
