import java.sql.Date;

public abstract class Student {
	
	int no;
	String name;
	int year;
	String dob;
	String major;
	
	public Student(int no, String name, int year, String dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	
	
	
	public abstract void register();
	
	public void study() {
		
		System.out.println("Ögrenci araştırma yapıyor");
		
	}
	
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode()); }



	public Student() {
		super();
	}
	

}
