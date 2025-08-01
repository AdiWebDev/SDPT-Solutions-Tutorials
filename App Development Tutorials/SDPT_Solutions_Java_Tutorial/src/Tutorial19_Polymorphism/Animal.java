package Tutorial19_Polymorphism;

public class Animal { 
	String name; 
	int age;
	String AnimalType;
	
	Animal(){
		
	}
	Animal( String name, int age, String AnimalType){
		this.name = name;
		this.age = age;
		this.AnimalType = AnimalType;
	}
	void sound() {
		System.out.println("Override");
	} 
	
	void showStats() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Type : " + AnimalType);
	}
}
