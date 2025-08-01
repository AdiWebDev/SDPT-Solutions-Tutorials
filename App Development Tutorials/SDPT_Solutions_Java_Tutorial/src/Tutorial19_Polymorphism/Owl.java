package Tutorial19_Polymorphism;

public class Owl extends WindAnimals { 
	
       Owl(String name, int age, String AnimalType){
    	   this.name = name; 
    	   this.age = age;
    	   this.AnimalType = AnimalType;
       } 
       
       void sound() {
    	  System.out.println("Whooo-whooo!");
       }
}
