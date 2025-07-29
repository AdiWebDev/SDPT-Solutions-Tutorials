package javaFundamentals;
import java.util.*;
public class Tutorial03_InputAndArithmethicOperators {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
	
	float num1; 
	float num2; 
	
	System.out.print("Enter num1: ");
	num1 = scanner.nextFloat();	 
	System.out.print("Enter num2: ");
	num2 = scanner.nextFloat();

//	Addition
	float sum = num1 + num2;  
	System.out.println("Result Addition: "+ sum);
//Subtraction
	float difference = num1 - num2; 
	System.out.println("Result Subtraction: "+ difference);
//Multiply 
	float product = num1 * num2; 
	System.out.println("Result Multiply: "+ product);
//Division 
	float qoutient = num1/num2;  
	System.out.println("Result Division: "+ qoutient);
//Modulus 
	float remainder = num1 % num2; 
	System.out.println("Result Modulus: "+ remainder);
	}
} 
