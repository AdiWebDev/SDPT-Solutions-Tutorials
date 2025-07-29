package javaFundamentals;

public class Tutorial09_ForEachLoop {
	
	public static void main(String[] args) {
		int []  numbers = {1,2,3,4,5}; 
		int sum =0;
		for(int number: numbers) { 
			 sum = sum + number;
		}
		System.out.println("Sum: " + sum);
	}

}
