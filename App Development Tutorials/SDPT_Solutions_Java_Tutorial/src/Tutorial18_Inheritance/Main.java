package Tutorial18_Inheritance;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		Output p = new Output();
		// We instantiate the scanner so that the input of the user can be store in the variable;
		
		p.print("Character Name	: " );
		String charName = s.nextLine();
		
		p.print("Weapon : " );
		String weapon = s.nextLine();
		
		p.print("Health Points	: " );
		int hp = s.nextInt();
		
		p.print("Experience Points	: " );
		int exp = s.nextInt();
		
		p.print("Level : " );
		int level = s.nextInt();
		
		p.print("How many arrows you want : " );
		int arrow = s.nextInt();
		// after that, it will go to our parameters.
		// These values are then passed as arguments to the constructors.
		Character character = new Character(charName, weapon, hp, exp, level);
		character.viewCharacter();
		
		Marksman marksman = new Marksman(charName, weapon, hp, exp, level, arrow); 
		marksman.viewCharacter(); 
		marksman.useWeapon();
		
		Fighter fighter = new Fighter(charName, weapon, hp, exp, level);
		fighter.viewCharacter(); 
		fighter.useWeapon();
	
	}

}
