package Tutorial21_AbstractWithInterface;

public class Motorboat extends Vehicle implements Water{
	 
	public void sail() {
	    System.out.println("The boat is now sailing smoothly on the water.");
	}

	public void anchor() {
	    System.out.println("The anchor has been dropped. The boat is now stationary.");
	}

}
