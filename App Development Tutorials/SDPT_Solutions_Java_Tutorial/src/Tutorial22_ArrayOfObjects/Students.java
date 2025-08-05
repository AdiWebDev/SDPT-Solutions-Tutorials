package Tutorial22_ArrayOfObjects;

public class Students {
	private String firstname, lastname; 
	private String course;
	private char section; 
	private int year; 
	
	
	
	 
	 public void setFirstname (String firstname){
		 this.firstname = firstname; 
	} 
	
	 public void setLastname (String lastname){
		 this.lastname = lastname; 
	 
	} 
	 public void setYear (int year){
		 this.year = year; 
	 
	} 
	 
	 public void setCourse (String course){
		 this.course = course; 

	} 
	 
	
	 public void setSection (char section){
		 this.section = section; 
	} 
	 
	 
	 public void showInfo() {
		 System.out.println("=========Student Information======");
		 System.out.println("Fullname		: " + firstname + " " + lastname);
		 System.out.println("Course/Yr/Sec.	:  " + course + " " + year + section);
		 System.out.println("==================================");
		 System.out.println(" ");
	 }

	
}
