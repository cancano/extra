import java.util.Scanner;

public class Extra(String args[]) {

	// creating a function to find the minimum of three values given
	// it should accept theree integers as arguments and return one integer value which is the minimum of the three
	static int minimum(int num1, int num2, int num3) {
		// defining a variable to store the minimum value
		int min;

		// using the same code logic given in the program to find the minimum
		if(num1 < num2) {
			if(num1 < num3) {
				min = num1;
			}
			else {
				min = num3;
			}
		}
		else {
			if(num2 < num3) {
				min = num2;
			}
			else {
				min = num3;
			}
		}

		// returning the minimum value calculated 
		return min;
	}

	// creating a function to find the maximum of three values given
	// it should accept theree integers as arguments and return one integer value which is the maximum of the three
	static int maximum(int num1, int num2, int num3) {
		// defining a variable to store the maximum value
		int max;

		// using the similar code logic given in the program to find the maximum of the three numbers
		if(num1 > num2) {
			if(num1 > num3) {
				max = num1;
			}
			else {
				max = num3;
			}
		}
		else {
			if(num2 > num3) {
				max = num2;
			}
			else {
				max = num3;
			}
		}

		// returning the maximum value calculated 
		return max;
	}

	public static void main(String[] args) {
		int num1, num2, num3, min, max = 0;

		// using the given code to read inputs from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		// calling the functions defined to find the minimum and maximum values
		min = minimum(num1, num2, num3);
		max = maximum(num1, num2, num3);
		
		// displaying the min and max values found
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
	}
}