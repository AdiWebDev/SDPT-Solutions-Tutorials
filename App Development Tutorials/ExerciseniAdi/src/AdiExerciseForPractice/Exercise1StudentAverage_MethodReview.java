package AdiExerciseForPractice;
import java.util.*;

public class Exercise1StudentAverage_MethodReview {
	public static void main(String[] args) {
		double grades[] = new double[3];
		Scanner s = new Scanner(System.in);
		
		print("Enter student name: ");
		String student_name = s.nextLine();

		for (int i = 0; i < grades.length; i++) {
			print("Enter grade #" + (i + 1) + ": ");
			grades[i] = s.nextDouble();
			
			// Check each grade for validity
			if (grades[i] < 0 || grades[i] > 100) {
				print("Invalid grade entered. Please restart the program.");
				return; // Stop program if invalid input
			}
		}

		double result = getAverage(grades);

		print("Result:");
		if (result >= 75) {
			print("Passed!");
		} else {
			print("Failed :(");
		}
		print(student_name + "'s average grade is: " + String.format("%.2f", result));
	}

	static double getAverage(double grades[]) {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / grades.length;
	}

	static void print(String word) {
		System.out.println(word);
	}
}
