package Tutorial18_Inheritance;

public class Fighter extends Character { 
	
	Fighter(String charName, String weapon, int hp, int exp, int level){ 
		super(charName, weapon, hp, exp, level); 
		
	} 
	void useWeapon() {
		System.out.println("You launced attack");
	}
	void viewCharacter() {
		super.viewCharacter();
		System.out.println("I am a fighter haha");
	}

}
