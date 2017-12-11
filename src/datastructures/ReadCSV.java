package datastructures;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String fileName = "C:\\Users\\Dalton\\Documents\\Udemy\\Become a Junior Java Software Developer\\accounts.csv";
		String dataRow;
		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			//Read the file as long as it is not empty
			while ((dataRow = br.readLine()) !=null) {
				//Parse the data by commas
				String[] line = dataRow.split(",");
				//Add the data to collection
				data.add(line);
			}
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String[] account: data) {
			System.out.print("[ ");
			for (String field : account) {
				System.out.print(field + " ");
			}
			System.out.println("]");
			System.out.println(account[1]);
			
			
		}
		
	}

}
