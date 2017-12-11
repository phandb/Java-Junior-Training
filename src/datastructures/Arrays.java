package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// 
		String[] alphabet = {"a", "b", "c", "d", "e"};
		
		System.out.println("The old fashioned way");
		for (int i =0; i<5; i++) {
			System.out.print(alphabet[i] + " ");
		}
		System.out.println("\n\nUsing the length variable");
		int size = alphabet.length;
		for (int n =0; n<size; n++) {
			System.out.print(alphabet[n] + " ");
		}
		System.out.println("\n\nUsing the For-Each method");
		for (String letter : alphabet ) {
			System.out.print(letter + " ");
		}
		System.out.println("\n\nDouble Array");
		
		String[][] users = {
				{"John","William","jw@email.com", "5126432241"},
				{"Sarah", "Jackson", "sj@email.com", "7146542548"},
				{"Rachel", "Wallace", "rw@eail.com", "2816481256"},
				};
		//Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fileds: " + numOfFields);
		//Traverse the double array
		
		for (int i=0; i<numOfUsers; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		//Traverse the double array
		System.out.println("\n\nUsing two FOR loops");
				for (int i=0; i<numOfUsers; i++) {
					for (int j =0; j<numOfFields; j++)
					System.out.println(users[i][j]);
				}
		System.out.println("\n\nUsing FOR EACH");
		for (String[] user : users) {
			System.out.print("[ ");
			for (String field : user) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
			
		}
		
		//print backward
		for (String[] user : users) {
			
			for (int i=user.length-1;i>=0;i--) {
				System.out.print(user[i]);
			}
			
			
		}
		
		}

	}


