package Tutorial16_Encapsulation;
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  
		
		 output.print("UserID : ");
		 int userID = s.nextInt(); 
		 
		 s.nextLine();
		 
		 output.print("Username : ");
		 String userName = s.nextLine(); 
		 
		 output.print("Firstname : ");
		 String firstName = s.nextLine(); 
		 
		 output.print("Lastname : ");
		 String lastName = s.nextLine(); 
		
		User user = new User( userID,  userName,  firstName,  lastName);
		
		output.print(user.getUserName()); 
		
		 output.print(" Update Username : ");
		 userName = s.nextLine();  
		 user.setUserName(userName); 
		 output.print(user.getUserName()); 
		
	}

}
