package Tutorial24_ArrayList_StudentSimulation;
import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in); 
		ArrayList<Students> students = new ArrayList<>();
		students.add(new Students("LERO","MENDOZA", "BLIS", 3, 'F' ));
		students.add(new Students("HERO", "SALAZAR", "BAJ", 2, 'A' ));
		students.add(new Students("SHAENNE","GEUVARRA", "BLIS", 3, 'A' ));
		students.add(new Students("YEBERO","CALIXTRO", "BSIT", 2, 'F' ));
		String firstname;
		String lastname;
		String course; 
		int year; 
		char section;
		boolean isExit = false; 
		
		while(!isExit) {
			try {System.out.println("\"===== STUDENT MANAGEMENT MENU =====\"");
			
			System.out.println("1. Add Student.");
			System.out.println("2. View Student List.");
			System.out.println("3. View Student Information.");
			System.out.println("4. Update Student.");
			System.out.println("5. Delete Student.");
			System.out.println("6. Exit."); 
			System.out.print("Choice: "); 
			int input = s.nextInt();	
			s.nextLine();
			switch(input) {
				case 1: 
					System.out.println("====== Add a New Student =====\"");
					System.out.print("Enter first name: ");
					firstname = s.nextLine().toUpperCase();
					
					System.out.print("Enter last name: ");
					lastname = s.nextLine().toUpperCase();
					
					System.out.print("Enter course: ");
					course = s.nextLine().toUpperCase();
					
					System.out.print("Enter year: ");
					year = s.nextInt();
					s.nextLine();
					
					System.out.print("Enter section: ");
					section = s.nextLine().toUpperCase().charAt(0);
					students.add(new Students(firstname, lastname, course, year, section));
					break;
				
				case 2: 
					System.out.println("\n====== Student List =====");
					for(Students stud : students) {
						stud.studentList();
					}
					break;
				case 3: 
					System.out.println("\n====== View Student Information. =====");
					System.out.print("\n Enter the student number to view details: ");
					input = s.nextInt();
					input = input -1;
					if (students.size() == 0) {
					    System.out.println("The list is empty.");
					} else if (input >= 0 && input < students.size()) {
					    students.get(input).introduce();
					} else {
					    System.out.println("Invalid student number.");
					}
					s.nextLine();
					break;
				case 4: 
					System.out.println("\n====== Update Student Information. =====");
					System.out.print("\n Enter number you want to update:  ");
					input = s.nextInt();
					input -= 1;
					s.nextLine(); 
					if(input<students.size()) {
						System.out.print("New first name: ");
						firstname = s.nextLine().toUpperCase();
						
						System.out.print("New last name: ");
						lastname = s.nextLine().toUpperCase();
						
						System.out.print("New course: ");
						course = s.nextLine().toUpperCase();
						
						System.out.print("New year: ");
						year = s.nextInt();
						s.nextLine();
						
						System.out.print("New section: ");
						section = s.nextLine().toUpperCase()		.charAt(0);
						students.set(input, new Students(firstname, lastname, course, year, section));
					}else System.out.print("You have only " + (students.size() + 1) + "students");
					
					
					break;
				case 5: 
					System.out.println("\n====== Delete Student. =====");
					System.out.print("\n Enter number you want to delete:  ");
					input = s.nextInt() - 1;
					s.nextLine();
					if (input >= 0 && input < students.size()) {
					    students.remove(input);
					    System.out.println("Student deleted successfully.");
					} else {
					    System.out.println("Invalid student number.");
					}

					break;
				case 6: 
					System.out.println("Exiting Program...");
					isExit = true;
					break;
				default: 
					System.out.println("X Invalid choice. ");
					break;
			}
			
			}
			catch(InputMismatchException e) {
				System.out.println("X Invalid input. Please enter a number.");
				s.nextLine(); // Clear the invalid input from the buffer
			}

			
		} //While end bracket
		
		
		
	}
}
