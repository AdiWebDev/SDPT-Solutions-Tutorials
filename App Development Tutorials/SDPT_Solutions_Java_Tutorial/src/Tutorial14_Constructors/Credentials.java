package Tutorial14_Constructors;

public class Credentials {

	 String username; 
	 String password; 
	 
//	 ito naman ang ating constructor na papasok ang atin ginawang object. 
// 
	 Credentials(String username, String password){  
//		  ang ibig sabihin ng this ay tinutukoy na itong varaible na ito ay ang ating global variable. 
//		 ang value naman niya ang nang galing sa ating args 
		this.username = username; 
		this.password = password; 
		
		
		System.out.println(username  + "Created");
		System.out.println(password + "Created");
	}
}
