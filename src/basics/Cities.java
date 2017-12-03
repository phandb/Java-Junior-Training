package basics;

public class Cities {
	public static void main(String[] args) {
		//declare and define an array
		String[] cities = {"New York", "Austin", "Miami", "Houston"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare array
		String[] countries;
		
		//Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "England";
		countries[2] = "Canada";
		System.out.println(countries[2]);
		

		//declare & define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Texas";
		states[2] = "Florida";
		states[3] = "Colorado";
		states[4] = "New York";
		System.out.println(states[2]);
		
		int i = 0;
		//Do loop: entesrs the loop Then tests condition
		do {
			System.out.println("State: " + states[i]);
			i++;
			
		}while (i<5);
		
		int n = 0;
		boolean stateFound = false;
		//While loop: test condition first before enter loop
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			n++;
			
		}while (i<5);
		
		//For Loop: The best structure for iterating through an array
		System.out.println("\nUSING FOR LOOP");
		for (int j = 0; j < 5; j++) {
			System.out.println("State: " + states[j]);
		}
	}

}
