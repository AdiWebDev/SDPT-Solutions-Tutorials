package Tutorial20_Abstraction;

public class Main {

	public static void main(String[] args) {
		Dog bulldog = new Bulldog ();
		bulldog.setInfo("Bulldog1", 5, false);
		bulldog.makeSound();
		bulldog.viewStats();
		bulldog.walk(); 
		
	}

}
