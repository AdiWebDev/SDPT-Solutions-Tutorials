package Tutorial22_ArrayOfObjects;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Number of students: ");
		int numStudents = s.nextInt();
		s.nextLine();
		
		System.out.println();
		Students student [] = new Students[numStudents]; 
		
		String firstname = null, lastname = null; 
		String course; 
		char section;
		int year = 0;
		
		for(int i = 0; i<student.length; i++) { 
			student[i] = new Students();
			
			System.out.println("Student# " + (i + 1));
			System.out.print("Firstname : " ); 
			firstname = s.nextLine();
			student[i].setFirstname(firstname);
			
			System.out.print("Lastname  : " ); 
			lastname = s.nextLine();
			student[i].setLastname(lastname);
			
			System.out.print("Course 	: " ); 
			course = s.nextLine();
			student[i].setCourse(course);
			
			System.out.print("Section 	: " ); 
			section = s.nextLine().charAt(0);
			student[i].setSection(section);
			
			System.out.print("Year 		: " ); 
			year = s.nextInt();
			student[i].setYear(year);
			s.nextLine();

		} 
		
		for(Students st: student) {
			st.showInfo();
		}
		
		 
	}

}
