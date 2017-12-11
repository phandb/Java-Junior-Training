package algorithms;

public class Search {
	public static int linearSearch(int[] dataSet, int target) {
		//iterate through dataset searching for target
		for (int i=0; i < dataSet.length; i++) {
			if (dataSet[i] == target) {
				return i;
				//break;
			}
		}
		return -1;
	}
		public static int binarySearch(int[] dataSet, int target, int start, int end) {
			//binary search assumes a sorted array and can therefore continually split our search domain in half
			System.out.println("Searching between " + dataSet[start] + " and " + dataSet[end]);
			int middle = (int) Math.floor(((start+end)/2));
			int value = dataSet[middle];
			//System.out.println(middle + " " + value);
			
			if (target > value ) {
				System.out.println(target + " > " + value);
				return binarySearch(dataSet, target, middle , end);
			}else if (target < value) {
				System.out.println(target + " < " + value);
				return binarySearch(dataSet, target, start, middle);
			}
			System.out.println(target + " = " + value);
			return middle;
	}

}
