package assignmentThree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteriaApp {
	/*
	 * Read a file that checks the criteria for a password

1. Read a file that contains multiple sets of passwords (use http://www.theonegenerator.com/ to generate a set of test data)

2. Verify that the password contains all of the following criteria:
1. A number
2. A letter
3. Special character (! @ #)

3. Create three User Defined Exceptions for the corresponding criteria.

4. If the password does not meet the criteria, create and throw the appropriate exception
	 * */

	public static void main(String[] args) {
		//1. Read a file that contains multiple sets of passwords 
		
		String fileName = "C:\\Users\\Dalton\\Documents\\Udemy\\Become a Junior Java Software Developer\\passwords.txt";
		File file = new File(fileName);
		String password = null;
		String[] passwords = new String[13];
		String numbers = "(.*[0-9].*)";
		String lowerCaseLetters = "(.*[a-z].*)";
		String upperCaseLetters = "(.*[A-Z].*)";
		String specialChars = "(.*[!@#].*)";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//use for loop to read lines of passwords file
			for (int i=0; i<passwords.length;i++) {
				passwords[i] = br.readLine();
				//System.out.println(passwords[i]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the file");
			e.printStackTrace();
		}
		/*2. Verify that the password contains all of the following criteria:
			1. A number
			2. A letter
			3. Special character (! @ #)*/
		for (int i=0; i<passwords.length;i++) {
			password = passwords[i];
			System.out.println("----------------------------------------------");
			try {
				//Check for containing at least a number
				if (!password.matches(numbers)) {
					throw new numberCriteriaException(password);
				}
				//Check for containing at least a character
				if (!password.matches(lowerCaseLetters) || (!password.matches(upperCaseLetters))) {
					throw new letterCriteriaException(password);
				}
				//Check for containing at least a special character
				if (!password.matches(specialChars)) {
					throw new specialCharCriteriaException(password);
				}
				System.out.println("Valid password: " + password);
			}catch (numberCriteriaException e) {
				System.out.println("ERROR: password does not contain a number");
				System.out.println(e.toString());
			} catch (letterCriteriaException e) {
				System.out.println("ERROR: password does not contain a letter");
				System.out.println(e.toString());
			} catch (specialCharCriteriaException e) {
				System.out.println("ERROR: password does not contain a special character");
				System.out.println(e.toString());
			
			}
		}
		
	}

}

class numberCriteriaException extends Exception {
	String password;
	numberCriteriaException(String password){
		this.password = password;
	}
	public String toString() {
		return ("Number Exception: " + password);
	}
	
}

class letterCriteriaException extends Exception {
	String password;
	letterCriteriaException(String password){
		this.password = password;
	}
	public String toString() {
		return ("Letter Exception: " + password);
	}
}

class specialCharCriteriaException extends Exception {
	String password;
	specialCharCriteriaException(String password) {
		this.password = password;
		
	}
	
	public String toString() {
		return ("Special Characters Exception: " + password);
	}
}