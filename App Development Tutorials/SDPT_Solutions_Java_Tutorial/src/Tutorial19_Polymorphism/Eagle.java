package Tutorial19_Polymorphism;

public class Eagle extends WindAnimals { 
	
       Eagle(String name, int age, String AnimalType){
    	   this.name = name; 
    	   this.age = age;
    	   this.AnimalType = AnimalType;
       } 
       
       void sound() {
    	  System.out.println("screee!");
       }
}
