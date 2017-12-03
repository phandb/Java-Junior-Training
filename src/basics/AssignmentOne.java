package basics;
import java.util.*;
public class AssignmentOne {
	// Basic concepts of programming, arrays, functions, and data manipulation
	// 1. Write a function that takes a value n return the sum of numbers 1 to n
	// 2. write a function that computes the factorial value
	// 3. Write 3 functions that take an array as a parameter and return the minimum, average, and maximum 
	//values of that array.
	/*public static int numbers = 9;
	public static int sumOfN = 0;*/
	
	public static void main(String[] args) {
		int[] arrayNumbers = {2, 3, 5, 7, 10};
		
		int numbers = 1;
		//Call function to return sum on n numbers
		System.out.println("The sum  of numbers from 1 to " + numbers + ": " + sumOfNumbers(numbers));	
		
		//Cal function to calculate factorial of a number
		System.out.println("The factorial of " + numbers + ": " + factorial(numbers));
		
		//Show the array
		System.out.print("Array: ");
		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.print(arrayNumbers[i] + " ");
		}
		
		//Minimum of the array
		System.out.println("\nMinimum number of the array: " + minOfArray(arrayNumbers));
		//maximum of the array
		System.out.println("Maximum number of the array: " + maxOfArray(arrayNumbers));
		//average the array
		System.out.println("Average of the array: " + ((float)averageOfArray(arrayNumbers)/arrayNumbers.length));;
	}
	public static int sumOfNumbers(int x) {
		//This function return sum of 1 to x
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum  = sum + i;
		}
		return sum;
					
	}
	public static int factorial(int x) {
		//This function return factorial of number x
		if (x == 0) {
			return 1;
		}
		
		return (x * factorial(x-1));
	}
	
	public static int minOfArray(int[] arrayX) {
		int min = arrayX[0];
		for (int i = 0; i < arrayX.length; i++) {
			if (arrayX[i] < min) {
				min = arrayX[i];
			}
		}
		return min;
		
		
	}
	public static int maxOfArray(int[] arrayX) {
		int max = arrayX[0];
		for (int i = 0; i < arrayX.length; i++) {
			if (arrayX[i] > max) {
				max = arrayX[i];
			}
		}
		return max;
		
		
	}
	public static int averageOfArray(int[] arrayX) {
		int sumOfArray = 0;
		if (arrayX.length == 0) {
			System.out.println("This is an empty array");
		}
		else {
			
			for (int i = 0; i < arrayX.length; i++) {
				sumOfArray = sumOfArray + arrayX[i];
			}
			
		}
		return sumOfArray;
	}

}
