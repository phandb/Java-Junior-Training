package datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection
		//LinkedSet -- in order that they were entered
		//TreeSet --rearrange to natural order
		//HashSet --Complete random order
		HashSet<String> animals = new HashSet<String>();
		
		//2. Adding elements
		animals.add("dog");
		animals.add("snake");
		animals.add("cat");
		animals.add("pig");
		animals.add("hog");
		
		//HashSet will print out a random order
		System.out.println(animals.size() + " " + animals);
		
		animals.add("goose");
		animals.add("snake");
		animals.add("cat");
		//No double add
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that we can use for comparison
		Set<String> Animals = new HashSet<String>();
		Animals.add("dog");
		Animals.add("snake");
		Animals.add("cat");
		Animals.add("pig");
		Animals.add("hog");
		Animals.add("goose");
		Animals.add("snake");
		Animals.add("cat");
		System.out.println(animals.size() + " " + Animals);
		
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chickens");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		//What is the intersection between Animals and farmAnimals "AND"
		//1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(Animals);
		//2. Retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		//What is the UNION "OR"
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(Animals);
		System.out.println("The union is : " + unionSet);
		
		//What is the DIFFERENCE "XOR"
		Set<String> differenceSet = new HashSet<String>(Animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The union is : " + differenceSet);
		
	}

}
