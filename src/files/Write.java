package files;

import java.io.*;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path that we want to write
		String filename = "C:\\Users\\Dalton\\Documents\\Udemy\\Become a Junior Java Software Developer\\FileToWrite.txt";
		String message = "I am writing data that will be placed to a file";
		//2.  Create the file in Java
		File file = new File(filename);
		try {
			//3. Open the file
			FileWriter fw = new FileWriter(file);
			//4. Write to the file
			fw.write(message);
			
			//5. Close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + filename);
			e.printStackTrace();
		}
		System.out.println("Closing the filewriter");
		
		
		
		
		
		

	}

}
