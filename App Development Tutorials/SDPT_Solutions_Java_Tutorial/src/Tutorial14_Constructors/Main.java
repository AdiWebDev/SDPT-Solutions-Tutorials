/*Una nating ginawa gumawa tayo ng main class natin hindi ko alam kung bakit kailgan pbulic static void main don sa main . 
 * 
 * */

package Tutorial14_Constructors;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {	 
		// create scanner for input
		Scanner s = new Scanner(System.in);
		// gumawa tayo ng variable para dito ma store yung data ng username at pass natin.
		
		System.out.print("Enter username: "); 
		String username = s.nextLine();
		
		System.out.print("Enter password: ");
		String password = s.nextLine();  
		
//		ngayon nag instantiate tayo ang instantiatio ay ang pag gamit ng template ng paulit ulit para makapag design ng object.
// ngayon may arguments tayo username and password
		Credentials newCredentials = new Credentials( username,  password);
		
	
		
	
	}

}
