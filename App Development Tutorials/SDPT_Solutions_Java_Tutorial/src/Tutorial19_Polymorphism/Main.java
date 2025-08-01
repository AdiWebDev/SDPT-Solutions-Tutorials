package Tutorial19_Polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal animal =  new Animal("Bugi", 12, "Fly"); 
		WindAnimals eagle  = new Eagle("Eaglito", 13, "Fly");
		WindAnimals owl  = new Owl("Owliboro", 13, "Fly");
		
		animal.showStats(); 
		System.out.println("");
		
		eagle.showStats();
		System.out.println("");
		
		owl.showStats();
		System.out.println("");
		
		animal.sound();
		eagle.sound();
		eagle.fly();
	}

	

}
