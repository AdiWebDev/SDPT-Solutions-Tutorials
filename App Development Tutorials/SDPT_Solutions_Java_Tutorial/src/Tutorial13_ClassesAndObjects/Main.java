package Tutorial13_ClassesAndObjects;

import Tutorial13_PackageForCars.*;
public class Main {

	public static void main(String[] args) {
		Cars myCar = new Cars(); 
		myCar.brand = "Toyota"; 
		myCar.color = "Yellow";
		
		displayOutput.print("Brand: " + myCar.brand);
		displayOutput.print("Color: " + myCar.color);
	}

}
