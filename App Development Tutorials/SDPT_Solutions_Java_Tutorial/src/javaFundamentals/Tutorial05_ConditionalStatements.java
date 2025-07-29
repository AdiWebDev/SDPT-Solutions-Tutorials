package javaFundamentals;
import java.util.*;
public class Tutorial05_ConditionalStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
	 

//		Input Grade 
		System.out.print("English		:"); 
		float english = s.nextFloat();
		
		System.out.print("Mathematics 	: "); 
		float math = s.nextFloat();	
		
		System.out.print("Science 		:"); 
		float science = s.nextFloat();
		
		System.out.print("Computer		:"); 
		float computer = s.nextFloat();
	
		float average = (english + math + science + computer)/ 4;
		System.out.println("Average 	:" +  average); 
		
		if(average > 100) System.out.println("Invalid Grade"); 
		else if (average>= 98) System.out.println("With Highest Honor"); 
		else if (average>=95) System.out.println("With High Honors"); 
		else if (average>= 90) System.out.println("With Honors"); 
		else if (average>= 75) System.out.println("Passed");  
		else System.out.print("Failed");
	}

}
