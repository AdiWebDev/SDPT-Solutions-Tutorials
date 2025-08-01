package Tutorial18_Inheritance;

public class Character {
	String charName, weapon; 
	int hp, exp, level;  
	
	// We create a constructor character to view the characters 
	// if we do this that is call method overloading 
//	Character( String charName, String weapon, int hp,int exp){ 
//		this.charName = charName; 
//		this.weapon = weapon; 
//		this.hp = hp; 
//		this.exp = exp; 
//		 
//}
	Character( String charName, String weapon, int hp,int exp, int level){ 
			this.charName = charName; 
			this.weapon = weapon; 
			this.hp = hp; 
			this.exp = exp; 
			this.level = level; 
	}
//	to see the info of the chracters
	void viewCharacter() {
		System.out.println("===Character Info===="); 
		System.out.println("Name : " + charName); 
		System.out.println("Weapon : " + weapon); 
		System.out.println("Health Points" + hp); 
		System.out.println("Experience Points     " + exp); 
		System.out.println("Level     " + level); 
		Output.print(" ");
	}

}
