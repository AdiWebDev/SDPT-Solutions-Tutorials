package Tutorial21_AbstractWithInterface;

public abstract class Vehicle {
		private String brand; 
		
		public void setBrand(String brand){
			this.brand = brand;
		} 
		public String getBrand() {
			return  brand;
		}
		 void startEngine() {
			 System.out.println("Engine started");
		 } 
		 void stopEngine() {
			 System.out.println("Engine stopped");
		 } 
		 
		 void brake() {
			 System.out.println("Stop the car");
		} 
		 
		public  void showBrand() {
			 System.out.println("Car brand: " + brand);
		 } 

}	
