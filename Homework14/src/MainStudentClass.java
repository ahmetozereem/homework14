import java.sql.Date;
import java.util.Calendar;

public class MainStudentClass {

	public static void main(String[] args) {

		
		Student studenta= new GraduateStudent();
		Student studentb= new GraduateStudent();
		
		/*
		 * Calendar cal1 = Calendar.getInstance(); cal1.set(1985, 1, 8);
		 * studenta.dob=(Date) cal1.getTime();
		 * 
		 * Calendar cal2 = Calendar.getInstance(); cal2.set(1988, 5, 11);
		 * studentb.dob=(Date) cal2.getTime();
		 */
	    
	    Student student1= new RegistrationOffice();
	    VocationalStudent student2= new VocationalStudent();
		UndergraduateStudent student3= new UndergraduateStudent();
		MasterStudent student4= new MasterStudent(235,"Ali", 2021, "02/05/1988", "Makina", "Danisman: Prof.Dr.....", "YLTez Konusu: .....");
		PhdStudent student5= new PhdStudent(123,"Ahmet", 2019, "09/02/1990", "Elektrik-Elektronik", "Danisman: Prof.Dr.....", "PhD Tez Konusu: .....", true);
		
		student1.register();
		student2.register();
		student3.register();
		student4.register();
		student5.register();
		
		student5.writePaper();
		System.out.println(student5.advisor);
		System.out.println(student5.dob);
		
		
		
	}

}
