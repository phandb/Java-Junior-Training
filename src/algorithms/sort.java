package algorithms;

public class sort {
	public static void bubbleSort(int[] dataSet) {
		boolean swapped;
		System.out.print("\nOriginal Array: \n");
		printArr(dataSet);
		//The Do..While loop will sort all data points
		do { 
			swapped = false;
			//The for loop just sort one data point only
			for (int i=0; i < dataSet.length-1; i++) {
				if (dataSet[i] > dataSet[i+1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					printArr(dataSet);
					swapped=true;
				}
			}
			//System.out.println("");
			
		}while(swapped);
			
		
	}
	private static void printArr(int[] arr) {
		//System.out.println("SWAPP");
		for (int i : arr) {
			System.out.print(i + " ");
			
		}
		System.out.println();
	}

}
