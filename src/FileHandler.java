package testing_prj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
	
	private String filepath = "";
	private ArrayList<String> Data_in; 
	
	// file_validator : object from class to check the correct num of inputs for each read line
	
	public FileHandler(){  
		Data_in = new ArrayList<String>();
	}
	
	public FileHandler(String file_path){
		Data_in = new ArrayList<String>();
		this.setPath(file_path);
	}
	
	public void setPath(String file_path) {
		this.filepath = file_path;
	}
	
	public ArrayList<String> GetData () throws FileNotFoundException{
		String temp = "";
		File file = new File(filepath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			temp = scanner.nextLine();
			// call validation function using file_validator object here
			Data_in.add(temp);
		}
		
		return Data_in;
		
	}
	
}
