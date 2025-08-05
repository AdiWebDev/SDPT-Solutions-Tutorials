package Tutorial23_Enums;

public class PetShopAvaialability {
		Day day; 
		boolean isAvailable; 
		
		PetShopAvaialability(Day day, boolean isAvailable){
			this.day = day; 
			this.isAvailable = isAvailable;
		}
		
		public void showAvailability() {
			System.out.println("Pet shop on " + day + " is " + (isAvailable ? "Open" : "Closed"));
		}
		
		
}