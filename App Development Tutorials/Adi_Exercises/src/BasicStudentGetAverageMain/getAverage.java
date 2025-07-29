package BasicStudentGetAverageMain;

public class getAverage {
	public static int compute(int []grades) { 
		int sum = 0;  
		
		for(int i = 0; i<grades.length; i++ ) { 
			
			sum += grades[i]; 

		} 
		sum = sum / grades.length; 
		return sum;
	}
}
