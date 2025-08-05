package Tutorial21_AbstractWithInterface;

public class Main {
	public static void main (String [] args) {
		
		System.out.println("======Land Vehicle======");
		Car car = new Car();
		car.setBrand("Toyota");
		car.showBrand();  
		car.startEngine();
		car.openDoor();
		car.closeDoor();
		car.stopEngine();
		
		
		System.out.println("======Air Vehicle======");
		Airplane airplane = new Airplane();
		airplane.startEngine();
		airplane.fly();
		airplane.landfromAir();
		airplane.stopEngine();
	
		
		
		System.out.println("======Water Vehicle======");
		Motorboat motorboat = new Motorboat();
		motorboat.startEngine();
		motorboat.sail();
		motorboat.anchor();
		motorboat.stopEngine();
	
		
		

	}
}
