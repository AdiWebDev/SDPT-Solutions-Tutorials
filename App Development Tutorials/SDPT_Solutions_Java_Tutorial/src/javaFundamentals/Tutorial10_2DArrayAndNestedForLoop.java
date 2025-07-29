package javaFundamentals;

public class Tutorial10_2DArrayAndNestedForLoop {

	public static void main(String[] args) {
		String users[][] = { 
			{"David", "david123"},
			{"Alenere", "alenere123"},
			{"Hezel", "hezel123"},
			{"Jaymar", "jaymar123"}
		};

		for (String[] user : users) {
			for (String info : user) {
				System.out.print(info + " "); // print in the same line with space
			}
			System.out.println(); // new line after each row
		}
	}
}
