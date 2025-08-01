package Tutorial16_Encapsulation;

public class User {
	private int userID; 
	private String userName; 
	private String firstName, lastName;
	
	User(int userID, String userName, String firstName, String lastName){
		this.userID = userID;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	String getUserName() {
		return userName;
	}
	
	void setUserName(String userName) {
		this.userName += userName ;
	}
}
