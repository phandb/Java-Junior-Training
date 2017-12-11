package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 30, 73, 455, 132, 98, 22, 5, 9};
		int[] sortedNumbers = {2,4,8,12,16,18,22,25,35,38,45,47,56,62,72,84,86,98};
		// Call a linear search function that searches for a specific number
		int pos = algorithms.Search.linearSearch(numbers,73);
		System.out.println("Found at position: " + pos);
		
		// Call linear search function 
		int index = algorithms.Search.binarySearch(sortedNumbers, 4,0, sortedNumbers.length-1);
		System.out.println("Found at position: " + index);
		
		//Call the bubble sort function
		sort.bubbleSort(numbers);
	}

}
