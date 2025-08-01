package Tutorial20_Abstraction;

abstract class Animal { 
	String name; 
	int age;
	
		void setInfo(String name, int age) {
			this.name = name; 
			this.age = age;
		}
		
		void viewStats() {
			System.out.println("Name : " + name); 
			System.out.println("Age :  " + age);
		}
		
		abstract void makeSound();
		
}
