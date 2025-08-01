package Tutorial17_MethodOverloading;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Num1 : ");
		int num1 = s.nextInt();
		System.out.println("Num2: ");
		int num2 = s.nextInt();
		int result = Calculate.add(num1,num2);
		System.out.print("Result of adding two numbers : " + result);
	}

}
