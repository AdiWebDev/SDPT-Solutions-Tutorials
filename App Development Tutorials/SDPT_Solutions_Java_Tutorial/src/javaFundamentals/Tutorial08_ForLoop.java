package javaFundamentals;
import java.util.Scanner;
public class Tutorial08_ForLoop {
	
	public static void main (String [] args) { 
		
		Scanner s = new Scanner(System.in); // ✅ initialize Scanner
		String [] usernames = { "SDPTAdi",
								"SDPTDion"};
		
		String [] passwords  = { "Adi123",
								"Dion123"}; 
			
		System.out.print("Enter your username: "); 
		String username = s.nextLine(); 
		System.out.print("Enter your password: "); 
		String password = s.nextLine();
		
		boolean isExist = false;
		for(int i = 0; i<usernames.length; i++) { 
			if(username.equals(usernames[i])&& password.equals(passwords[i])) { 
				isExist = true;
				break;}
		}
		if(isExist) System.out.println("Welcome "+ username); 
		else System.out.println("Account not found");
		
	}
}



