package javaFundamentals;

public class Tutorial11_MethodOrFunctions {
	
	
	public static void main(String[] args) { 
		int numbers[] = {1, 2, 3, 4}; 
		int result = summation(numbers);
		print("Result " + result );
	}
	
	static int summation(int [] numbers) {  
		int sum = 0; 
		for(int i = 0; i<numbers.length; i++) { 
			 sum = sum + numbers[i];
			} 
		return sum;
	}
	
	
////Mas pinaikling Sys.out
	static void print(String word) { 
		System.out.println(word);
	}
			
/*Explanation: 
 Una, gumawa tayo ng array na numbers na naglalaman ng mga integer (1, 2, 3, 4).
Pagkatapos, gumawa tayo ng result na variable kung saan natin i-store ang output ng method na summation(numbers).

Ang method na summation ay tumatanggap ng integer array bilang parameter.
Sa loob ng method na ito, gumawa tayo ng variable na sum na may initial value na 0.
Gamit ang for loop, iniikot natin ang bawat laman ng array (numbers[i]) at ina-add ito sa sum.

Halimbawa ng loop:

Unang ikot: sum = 0 + 1 → sum = 1

Pangalawa: sum = 1 + 2 → sum = 3

Pangatlo: sum = 3 + 3 → sum = 6

Pang-apat: sum = 6 + 4 → sum = 10

Kapag tapos na ang loop, ibinabalik (return) ng method ang total na sum, na siya namang nilalagay sa result variable sa main() method.

Ginamit natin ang static kasi nasa iisang class tayo at gusto nating matawag ang method nang hindi na gumagawa ng object.

May isa rin tayong simpleng method na tinawag na print(String word) para mapalitan ang System.out.println(word) at mas mapadali ang pag-print ng output.*/


	

	
}
