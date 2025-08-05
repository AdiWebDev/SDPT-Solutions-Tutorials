package Tutorial23_Enums;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		USCurrency coins[] = new USCurrency[3]; 
		  
		coins[0] = USCurrency.DIME;
		coins[1] = USCurrency.NICKLE;
		coins[2] = USCurrency.QUARTER;
		
		float sum = 0; 
		String name = "";
		for (USCurrency coin : coins) {
			
			sum = sum + coin.value;
			name = name + coin.name + " ";
			
		}
		
		System.out.println(sum);
		System.out.println(name);
	}

}
