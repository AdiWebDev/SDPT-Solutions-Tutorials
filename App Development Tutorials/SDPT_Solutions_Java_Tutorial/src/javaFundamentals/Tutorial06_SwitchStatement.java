package javaFundamentals;
import java.util.*;
public class Tutorial06_SwitchStatement {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in); 
		int monthnum = 0;
		String monthword = null;
		
		System.out.print("Month: ");
		monthnum = s.nextInt();
		
		switch(monthnum) { 
		case 1: monthword = "January"; 
				break;
		case 2: monthword = "February"; 
				break;
		case 3: monthword = "March"; 
				break;
		case 4: monthword = "April"; 
				break;
		case 5: monthword = "May"; 
				break;
		case 6: monthword = "June"; 
				break;
		case 7: monthword = "July"; 
				break;
		case 8: monthword = "August"; 
				break;
		case 9: monthword = "September"; 
				break;
		case 10: monthword = "October"; 
				break;
		case 11: monthword = "November"; 
				break;
		case 12: monthword = "December"; 
				break;
		default: 
				System.out.println("Invalid Month");
		} 
		
		System.out.print("Date: ");
		int date = s.nextInt(); 
		
		System.out.print("Year: ");
		int year = s.nextInt(); 
		
		if(date > 31 || date <= 0) System.out.println("Invalid");

		else System.out.println(monthword + " " + date + " "  + year);
	
	}

}
