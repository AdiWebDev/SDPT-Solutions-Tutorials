package BasicStudentGetAverageMain;
import BasicStudentGetAverageMain.*;
import java.util.*;
public class main {  
	public static void main(String [] args) {  
		Scanner s = new Scanner(System.in);
		boolean isAnswer = false;
		int totalStudent = 0; 
		int totalSubject = 0; 
		
		while (!isAnswer) {
			System.out.print("How many students you want to input: ");
			if (s.hasNextInt()) {
				totalStudent = s.nextInt();
			} else {
				System.out.println("Invalid input. Please enter a number.");
				s.next(); // consume invalid input
				continue; // restart the loop
			}

			System.out.print("How many subjects you want to input: ");
			if (s.hasNextInt()) {
				totalSubject = s.nextInt();
			} else {
				System.out.println("Invalid input. Please enter a number.");
				s.next(); // consume invalid input
				continue; // restart the loop
			}

			if (totalStudent <= 0 || totalSubject <= 0) {
				System.out.println("Numbers must be greater than 0.\n");
			} else {
				isAnswer = true; // exit loop
			}
		}
	
		
		String student_names[] = new String [totalStudent];
		
		int grades[][] = new int [totalStudent][totalSubject];
		s.nextLine(); // FIX: consume leftover newline after nextInt()
		
		for(int i = 0; i<student_names.length; i++) { 
			System.out.print("Enter student name: "); 
			student_names[i] = s.nextLine();
			
			for(int x = 0; x<grades[i].length; x++) { 
				System.out.print("Input grade# " + (x + 1) + ": ");  
				grades[i][x] = s.nextInt();
			} 
			System.out.println(" ");
			s.nextLine();
		} 
		 
		System.out.println("===== STUDENT AVERAGES =====");
		for (int i = 0; i < totalStudent; i++) {
			int average = getAverage.compute(grades[i]);
			String greet ="";
			if(average>100) System.out.println("Invalid Grade"); 
			else if(average>=75) { 
				greet = "Passed";
			}
			else greet = "Failed";
			System.out.println(student_names[i] + "'s average: " + average + " " + greet);
		}
	}
	
}
