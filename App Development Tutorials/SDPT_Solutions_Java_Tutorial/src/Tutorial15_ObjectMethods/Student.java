package Tutorial15_ObjectMethods;

public class Student { 
	
	String firstName, lastName, year, course, section;
	float midtermGrade, finalGrade;
	
	Student( String firstName, String lastName, String year, String course, String section, float midtermGrade, float finalGrade){
		this.firstName = firstName; 
		this.lastName = lastName;
		this.year = year; 
		this.course =course ; 
		this.section =section ; 
		this.midtermGrade =midtermGrade ; 
		this.finalGrade = finalGrade; 
	}
	
	void introduceSelf() { 
		displayOutput.println("Fullname	: " + firstName + " " + lastName);
		displayOutput.println("Course	: " + course); 
		displayOutput.println("Year		: " + year); 
		displayOutput.println("Section	: " + section); 
	}
	
	void evaluateGrade() {
		float average = (midtermGrade + finalGrade) / 2; 
		String standing;
		if(average>100) standing = "Invalid Grade";
		else if(average>=98) standing = "With Highest Honor";
		else if(average>=95) standing = "With Hiigh Honor";
		else if(average>=90) standing = "With Honors";
		else if(average>75) standing =  "Passed";
		else standing  = "Failed"; 
		
		displayOutput.print("Average	: "+ standing);
		displayOutput.print("Standing	: "+ standing);
	}
}