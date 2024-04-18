package Implementation;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataAnalyzer {
	
	///////////////////////////  Fields
	
	private FileHandler filehandler; // used to get data read from file
	
	// student validation : object from student validator class invoke 
	private student_validator student_checker = new student_validator(); 
	// course  validation : object from course  validator class invoke
	private course_validator course_checker   = new course_validator();
	
	// student builder : object used to invoke build fcn to build student object with its data
	Student student;

	// course     	   : object used to hold a reference to created subject returning from call build function
	Course subject;
	
	private ArrayList<String> Data_All ; // data get from file handler class
	//private String[] Data_Line; // data splitted by comma for each line
	///////////////////////////   Functions
//	public DataAnalyzer() throws FileNotFoundException{
////		filehandler.getfileHandle();
//		Data_All  = filehandler.GetData();
//		//Data_Line = new ArrayList<String>();
//	}
	public DataAnalyzer(FileHandler file) throws FileNotFoundException{
//		filehandler.getfileHandle();
		filehandler = file;
		//Data_Line = new ArrayList<String>();
		Data_All  = filehandler.GetData();
	}
	
	void AnalyzeData() throws FileNotFoundException {
	// (1) check the validation for student and course if pass execute the following :
		// (1.1) double student_GPA   = GPA_Evaluation(Data_Line[2],Data_Line[3],Data_Line[4],Data_Line[5]) --> activities , oral , midterm , final
		// (1.2) string student_grade = Grade_Evaluation();
		// (1.3) student/course build --> create student/course object with his info 
		// add student object to the array list of students declared inside course class
		
	// (2) if not pass fire a failure with message
//		Data_All  = filehandler.GetData();
		for(int i=0;i<Data_All.size();i++) {
			String[] Data_Line = Data_All.get(i).split(",");
//			System.out.println(Data_Line.toString());
			if(i==0) 
			{	
				if(course_validator.isValid(Data_Line[0],Data_Line[1],Data_Line[2]))
				{
					subject = new Course(Data_Line[0],Data_Line[1],Integer.parseInt(Data_Line[2]));
					
					
				} 
				else 
				{
					System.out.println("Error in course constraints");
				}
				
			} 
			
			else 
			{
				// (1) check the validation for student and course if pass execute the following :
				if(student_validator.isValid(Data_Line[0],Data_Line[1],Data_Line[2],Data_Line[3],Data_Line[4],Data_Line[5])) 
				{
					String student_grade = this.Grade_Evaluation(Integer.parseInt(Data_Line[2]),Integer.parseInt(Data_Line[3]),Integer.parseInt(Data_Line[4]),Integer.parseInt(Data_Line[5]));
					double student_GPA   = this.GPA_Evaluation(student_grade);
					student = new Student(Data_Line[0],Data_Line[1],Integer.parseInt(Data_Line[2]),Integer.parseInt(Data_Line[3]),Integer.parseInt(Data_Line[4]),Integer.parseInt(Data_Line[5]),student_GPA,student_grade);
					subject.addStudent(student);
				
				}
				else 
				{
					System.out.println("Error in student constraints");
				}
			}
			
		}
	}
	
	double GPA_Evaluation(String Grade) {
		// logic for GPA calc.
		double GPA=0;
		if(Grade == "A+" || Grade == "A")
			GPA = 4;
		else if(Grade == "A-")
			GPA = 3.7;
		else if(Grade == "B+")
			GPA = 3.3;
		else if(Grade == "B")
			GPA = 3;
		else if(Grade == "B-")
			GPA = 2.7;
		else if(Grade == "C+")
			GPA = 2.3;
		else if(Grade == "C")
			GPA = 2;
		else if(Grade == "C-")
			GPA = 1.7;
		else if(Grade == "D+")
			GPA = 1.3;
		else if(Grade == "D")
			GPA = 1;
		else if(Grade == "F")
			GPA = 0;
		
		return GPA;
		
	}
	
	String Grade_Evaluation(int activities , int oral , int midterm, int finalExam) {
		// logic for Grade calc.
		String Grade = "";
//		double avg = (activities + oral + midterm + finalExam)/4.0;
		double total_marks = (activities + oral + midterm + finalExam);
		
		  if(total_marks >= 97 && total_marks<=100)
			  Grade = "A+";
		  else if(total_marks>=93 && total_marks<97)
			  Grade = "A";
	      else if(total_marks>=89 && total_marks<93)
	    	  Grade = "A-";
	      else if(total_marks>=84 && total_marks<89)
	    	  Grade = "B+";
	      else if(total_marks>=80 && total_marks<84)
	    	  Grade = "B";
	      else if(total_marks>=76 && total_marks<80)
	    	  Grade = "B-";
	      else if(total_marks>=73 && total_marks<76)
	    	  Grade = "C+";
	      else if(total_marks>=70 && total_marks<73)
	    	  Grade = "C";
	      else if(total_marks>=67 && total_marks<70)
	    	  Grade = "C-";
	      else if(total_marks>=64 && total_marks<67)
	    	  Grade = "D+";
	      else if(total_marks>=60 && total_marks<64)
	    	  Grade = "D";
	      else
	    	  Grade = "F";
		  
		  return Grade;
		
	}
	
	
	public Course extractSubject() {
		return subject;
	}
	

}
