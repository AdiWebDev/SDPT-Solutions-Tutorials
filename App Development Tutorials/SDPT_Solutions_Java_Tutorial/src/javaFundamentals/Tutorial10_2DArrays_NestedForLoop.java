package javaFundamentals;

public class Tutorial10_2DArrays_NestedForLoop {

	public static void main(String[] args) {
//		[rows][cols] 
		String users [][]= { 
				{"David", "david123"}, 
				{"Alenere", "alenere123"},
				{"Hezel", "hezel123"},
				{"Jaymar", "jaymar123"}
		}; 
		
		for(int row = 0; row<users.length; row++) { 
			for(int col = 0; col<users.length; col++) { 
				System.out.println(users[row][col]);
			}
		}
	}

}
