package Implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
	
	private String filepath = "";
	private ArrayList<String> Data_in; 
//	private DataAnalyzer data;
	// file_validator : object from class to check the correct num of inputs for each read line
	fileValidator file_validator = new fileValidator();
	public FileHandler() throws FileNotFoundException{  
//		this.setPath(file_path);
		Data_in = new ArrayList<String>();
//		data = new DataAnalyzer(this);
		file_validator = new  fileValidator();
	}
	
	public FileHandler(String file_path) throws FileNotFoundException{
		this.setPath(file_path);
		Data_in = new ArrayList<String>();
//		data = new DataAnalyzer(this);
		
//		file_validator = new  fileValidator();
	}
	
	public void setPath(String file_path) {
		this.filepath = file_path;
	}
//	public FileHandler getfileHandle() {
//		return this;
//	}


	public String getFilepath() {
		return filepath;
	}

	public ArrayList<String> getData_in() {
		return Data_in;
	}

	public void setData_in(ArrayList<String> data_in) {
		Data_in = data_in;
	}

	public fileValidator getFile_validator() {
		return file_validator;
	}

	public void setFile_validator(fileValidator file_validator) {
		this.file_validator = file_validator;
	}

	public ArrayList<String> GetData () throws FileNotFoundException{
		String temp = "";
		int line_num = 0;
		File file = new File(filepath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			temp = scanner.nextLine();
			// call validation function using file_validator object here
			if(file_validator.validateLine(temp, line_num)) {
					Data_in.add(temp);
					line_num++;
			} else {
				System.out.println("Error in number of read inputs");
				break;
			}
		}
		
		return Data_in;
		
	}
	
}
