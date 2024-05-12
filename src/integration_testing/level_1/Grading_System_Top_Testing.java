package integration_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;

import java.io.File;

import java.io.FileReader;

import java.util.Scanner;


import org.junit.jupiter.api.Test;



import testing_prj.main;

class Grading_System_Top_Testing {

//	@BeforeEach
//	void setUp() throws FileNotFoundException {
//		
//	}
	@Test
	void test1() throws Exception {
		
		
		String userInput = String.format("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC01.txt");
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());

        System.setIn(bais);
        
        File file = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC01.txt");
		FileReader FR1 = new FileReader(file);
        BufferedReader BR1 = new BufferedReader(FR1);
        String[] subjectProb1 = BR1.readLine().split(",");
        String subjectName = "Subject Name: "+subjectProb1[0];
        String maxMArk = " Max Mark: "+subjectProb1[2];
        
        //FileOutputStream baos = new FileOutputStream(subjectProb[0]+".txt");
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //PrintStream printStream = new PrintStream(baos);
        //System.setOut(printStream);
		main.main(null);
		File myfile = new File("AdvancedAlgorithms.txt");
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////// check output file is correctly generated    ///////////////////
		///////////////////////////////////////////////////////////////////////////////////
		assertTrue(myfile.exists());
		
		//FileReader FR2 = new FileReader(myfile);
		Scanner scanner = new Scanner(myfile);
        //BufferedReader BR2 = new BufferedReader(FR2);
        String firstLine = scanner.nextLine();
		String[] subjectProb = firstLine.split("\t");
        
        
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////     check subject validation    /////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
        assertEquals(subjectName, subjectProb[0]);
        assertEquals(maxMArk, subjectProb[2]);   
        
        scanner.nextLine();
        
        while(scanner.hasNextLine()) {
        	String student = scanner.nextLine();
        	String[] subjectProb2 = BR1.readLine().split(",");
    		String[] studentprob = student.split("\t\t\t\t"); 	
    		String[] gpa_grade = studentprob[2].split("\t\t\t");
    		
    		assertEquals(studentprob[0],subjectProb2[0]+" ");    // student name
    		assertEquals(studentprob[1]," "+subjectProb2[1]+" ");// student code
///////////////////////////////////////////////////////////////////////////////////
///////////////////////// 	    calc gpa and grade    	///////////////////////////
///////////////////////////////////////////////////////////////////////////////////
    		String grade = this.Grade_Evaluation(Integer.parseInt(subjectProb2[2]),Integer.parseInt(subjectProb2[3]),Integer.parseInt(subjectProb2[4]),Integer.parseInt(subjectProb2[5]));
    		double gpa = this.GPA_Evaluation(grade);
    		assertEquals(gpa_grade[1]," "+grade);// student grade
    		assertEquals(Double.parseDouble(gpa_grade[0]),gpa,0.0);	 // student gpa
        }
		
	}
	@Test
	void test2() throws Exception {
		String userInput = String.format("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC02.txt");
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());

        System.setIn(bais);
        
        File file = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC02.txt");
		FileReader FR1 = new FileReader(file);
        BufferedReader BR1 = new BufferedReader(FR1);
        String[] subjectProb1 = BR1.readLine().split(",");
        String subjectName = "Subject Name: "+subjectProb1[0];
        String maxMArk = " Max Mark: "+subjectProb1[2];
        
        //FileOutputStream baos = new FileOutputStream(subjectProb[0]+".txt");
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //PrintStream printStream = new PrintStream(baos);
        //System.setOut(printStream);
		main.main(null);
		File myfile = new File("DataStructure.txt");
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////// check output file is correctly generated    ///////////////////
		///////////////////////////////////////////////////////////////////////////////////
		assertTrue(myfile.exists());
		
		//FileReader FR2 = new FileReader(myfile);
		Scanner scanner = new Scanner(myfile);
		//BufferedReader BR2 = new BufferedReader(FR2);
		String firstLine = scanner.nextLine();
		String[] subjectProb = firstLine.split("\t");
		        
		        
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////     check subject validation    /////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		assertEquals(subjectName, subjectProb[0]);
		assertEquals(maxMArk, subjectProb[2]);   
		
		scanner.nextLine();
		
		 while(scanner.hasNextLine()) {
	        	String student = scanner.nextLine();
	        	String[] subjectProb2 = BR1.readLine().split(",");
	    		String[] studentprob = student.split("\t\t\t\t"); 	
	    		String[] gpa_grade = studentprob[2].split("\t\t\t");
	    		
	    		assertEquals(studentprob[0],subjectProb2[0]+" ");    // student name
	    		assertEquals(studentprob[1]," "+subjectProb2[1]+" ");// student code
	///////////////////////////////////////////////////////////////////////////////////
	///////////////////////// 	    calc gpa and grade    	///////////////////////////
	///////////////////////////////////////////////////////////////////////////////////
	    		String grade = this.Grade_Evaluation(Integer.parseInt(subjectProb2[2]),Integer.parseInt(subjectProb2[3]),Integer.parseInt(subjectProb2[4]),Integer.parseInt(subjectProb2[5]));
	    		double gpa = this.GPA_Evaluation(grade);
	    		assertEquals(gpa_grade[1]," "+grade);// student grade
	    		assertEquals(Double.parseDouble(gpa_grade[0]),gpa,0.0);	 // student gpa
	        }
		
	}
	
	
	//////////////////////////////////////////////////
	public double GPA_Evaluation(String Grade) {
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
	
	public String Grade_Evaluation(int activities , int oral , int midterm, int finalExam) {
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


}
