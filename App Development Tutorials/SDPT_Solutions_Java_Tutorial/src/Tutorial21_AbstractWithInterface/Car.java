package Tutorial21_AbstractWithInterface;

public class Car extends Vehicle implements Land {
	
	@Override
	public void drive() {
		System.out.println("Drivingg");
		
	}
	
	@Override
	public void changeWheel() {
		System.out.println("You changed the wheel");
		
	}
	@Override
	public void honk() {
		System.out.println("Beep!");
	}
	
	public void openDoor() {
		System.out.println("The door is now open."); 
	}
	public void closeDoor() {
		System.out.println("The door is now closed.");
	}
}
