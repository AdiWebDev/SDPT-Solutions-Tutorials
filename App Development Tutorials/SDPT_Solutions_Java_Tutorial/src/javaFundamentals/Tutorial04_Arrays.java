 package javaFundamentals;
import java.util.*;
public class Tutorial04_Arrays {

	public static void main(String[] args) {
	
	String email[] = new String[5]; 
	String username[] = new String[5]; 
	String password[] = new String[5];  
	int index = 0;
	
	Scanner s = new Scanner(System.in);  
	
	//Index 0
	System.out.print("Enter email 1: "); 
	email[0] = s.nextLine(); 
	System.out.print("Enter username 1: "); 
	username[0] = s.nextLine(); 
	System.out.print("Enter password 1: "); 
	password[0] = s.nextLine(); 
	
	//Index 1
	System.out.print("Enter email 2: "); 
	email[1] = s.nextLine(); 
	System.out.print("Enter username 2: "); 
	username[1] = s.nextLine(); 
	System.out.print("Enter password 2: "); 
	password[1] = s.nextLine();  
	
	//Index 2
	System.out.print("Enter email 3: "); 
	email[2] = s.nextLine(); 
	System.out.print("Enter username 3: "); 
	username[2] = s.nextLine(); 
	System.out.print("Enter password 3: "); 
	password[2] = s.nextLine();  
	

	

	//Result 
	System.out.println("Index		: " + index);
	System.out.println("Email		: " + email[index]); 
	System.out.println("Username 	: " + username[index]); 
	System.out.println("Password	: " + password[index]);
	
	}
}
