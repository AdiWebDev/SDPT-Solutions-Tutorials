package Tutorial24_ArrayList_StudentSimulation;

public class Students {
	String firstname, lastname; 
	String course; 
	int year; 
	char section;
	Students(){};
	Students(String firstname,
			 String lastname,
			 String course,
			 int year,
			 char section){
		this.firstname = firstname; 
		this.lastname = lastname; 
		this.course = course; 
		this.year = year; 
		this.section = section;
	}
	void studentList () {
		System.out.println("\nFull Name: " + firstname + " " + lastname); 
		System.out.println("Course   : " + course); 
		System.out.println("Year   : " + year); 
		System.out.println("Section   : " + section); 
		
	}
	void introduce() {
		System.out.println("====Student Information===");
		System.out.println("I am " +firstname + " " + lastname);
		System.out.println("From " + course + " " + year +section);
	}

}
