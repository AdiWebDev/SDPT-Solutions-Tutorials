package Tutorial20_Abstraction;

abstract class Dog extends Land {
		
	

	boolean isGroom;
	//Overload 
	void setInfo(String name, int age, boolean isGroom) {
		super.setInfo(name, age);
		this.isGroom = isGroom;
	}
	
	@Override 
	void makeSound() {
		System.out.println("The sound of the dog is arfff");
	} 
	
	@Override
	void viewStats() {
		super.viewStats();
		if(!isGroom) {
			System.out.println("Go to pet salon");
			groom();
		}else System.out.println("Wow good dog");
	}
	
	void groom() {
		System.out.println("Thank you for the treat");
	}
	
}
