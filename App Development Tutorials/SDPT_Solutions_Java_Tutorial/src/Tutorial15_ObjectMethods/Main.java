package Tutorial15_ObjectMethods;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Scanner 
		Scanner s = new Scanner(System.in); 
		
		displayOutput.print("Firstname: ");
		String firstName = s.nextLine();
		
		displayOutput.print("Lastname: ");
		String lastName = s.nextLine();
		
		displayOutput.print("Year: ");
		String year = s.nextLine();
		
		displayOutput.print("Course: ");
		String course = s.nextLine();
		
		displayOutput.print("Section: ");
		String section = s.nextLine();  
		
		displayOutput.print("midtermGrade: ");
		float midtermGrade = s.nextFloat();
		
		displayOutput.print("finalGrade: ");
		float finalGrade = s.nextFloat();
		
		Student student = new Student(firstName,
										lastName, 
										year, 
										course,
										section,
										midtermGrade, 
										finalGrade);  
		
		displayOutput.println("=====Student Information=====");
		student.introduceSelf(); 
		student.evaluateGrade();
	}  

}
