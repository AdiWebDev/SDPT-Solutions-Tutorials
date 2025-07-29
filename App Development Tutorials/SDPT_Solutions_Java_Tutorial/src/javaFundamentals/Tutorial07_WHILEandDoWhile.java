package javaFundamentals;
import java.util.*;
public class Tutorial07_WHILEandDoWhile {
	
	public static void main(String[] args) {
	// While - habang true ang condition, tutuloy ang code.  
	// Do While - gagawin muna yug nasa loob, bago gawin yung condtion
		int lives = 3; 
		Scanner s = new Scanner(System.in); 
	
		while(lives>0) { 
			System.out.println("Anong ang pambasang bulaklak?");
			System.out.print("Answer : ");   
			String answer = s.nextLine(); 
			if(!answer.equalsIgnoreCase("Sampaguita")) { 
				lives--;  
				System.out.println("Life: " + lives);
				
				if(lives == 0)System.out.println("Game Over");	
			}
			else {
				System.out.println("You Won!");
				break;
			}
		} 
		

	}
}