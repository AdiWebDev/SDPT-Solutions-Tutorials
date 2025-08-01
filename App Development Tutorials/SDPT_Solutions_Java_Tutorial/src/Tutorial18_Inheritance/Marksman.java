package Tutorial18_Inheritance;
//We create the subclass Marksman that inherits from Character.


public class Marksman extends Character { 
	// we add  new variable arrow

	
	int arrow;
   
	Marksman(String charName, String weapon, int hp,int exp, int level, int arrow){ 
		super(charName, weapon, hp, exp, level); 
		this.arrow = arrow; 	
	} 
	// we add a new method which is to use their weapon
	void useWeapon() {
		System.out.println("You released an arrow");
	}
	
	// We override the viewCharacter() method to include arrow information for Marksman.

	void viewCharacter() {
		super.viewCharacter();
		System.out.println("Arrow left: " + arrow);
		System.out.println("I am a marksman haha");
	} 
}
