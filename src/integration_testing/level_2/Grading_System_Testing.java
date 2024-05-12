package integration_testing;

import static org.junit.Assert.*;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import testing_prj.Course;
import testing_prj.DataAnalyzer;
import testing_prj.FileHandler;
import testing_prj.Student;
import testing_prj.course_validator;
import testing_prj.fileValidator;
import testing_prj.outputGenerator;
import testing_prj.student_validator;

public class Grading_System_Testing {
	
	
	
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(1)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB01() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC01.txt");
		FileReader FR = new FileReader(myfile);
        try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC01.txt");
			//fileValidator file_v = new fileValidator();
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			analyzer.AnalyzeData();
			Course result = analyzer.extractSubject(); 
			@SuppressWarnings("unchecked")
			
			ArrayList<Student> students =  result.extract();
			//Iterator<Student> = new Iterator<>;
			///////////////////////////////////////////////////////////////////////////////////
			/////////////////////////     check subject validation    /////////////////////////
			///////////////////////////////////////////////////////////////////////////////////
			
			String[] subjectProb = BR.readLine().split(",");
			
			assertTrue(course_checker.isValid(subjectProb[0], subjectProb[1], subjectProb[2]));       
			
			assertEquals(subjectProb[0], result.getCourseName());
			assertEquals(subjectProb[1], result.getCourseCode());
			assertEquals(Integer.parseInt(subjectProb[2]), result.getFullMark());
      
			
			//it.forEachRemaining((student) -> {
			students.forEach((student)-> {	
				/////////////////////////////////////
				 String line;
			     String[] studentProb;
			     try {
			     if ((line = BR.readLine()) != null) {     		
			        studentProb = line.split(",");
			        assertTrue(student_checker.isValid(studentProb[0], studentProb[1], studentProb[2],studentProb[3], studentProb[4],studentProb[5]));    
			        assertEquals(student.getStudentName(), studentProb[0]);
			        assertEquals(student.getStudentID(), studentProb[1]);
			        assertEquals(student.getStudent_activities(), Integer.parseInt(studentProb[2]));
			        assertEquals(student.getStudent_oral(), Integer.parseInt(studentProb[3]));
			        assertEquals(student.getStudent_midterm(), Integer.parseInt(studentProb[4]));
			        assertEquals(student.getStudent_final(), Integer.parseInt(studentProb[5]));
			    } else {
			        fail("number of expected notcorrect!");
			    }
			     } catch (IOException ex) {
			         throw new RuntimeException(ex);
			     }
				/////////////////////////////////////
			});
		}
        
        
        System.out.println("passed.");
    }
	
	
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(2)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@Test
	 public void testReadFileBB02() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC02.txt");
		FileReader FR = new FileReader(myfile);
       try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC02.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			analyzer.AnalyzeData();
			Course result = analyzer.extractSubject(); 
			@SuppressWarnings("unchecked")
			
			ArrayList<Student> students =  result.extract();
			//Iterator<Student> = new Iterator<>;
			///////////////////////////////////////////////////////////////////////////////////
			/////////////////////////     check subject validation    /////////////////////////
			///////////////////////////////////////////////////////////////////////////////////
			String[] subjectProb = BR.readLine().split(",");
			
			assertTrue(course_checker.isValid(subjectProb[0], subjectProb[1], subjectProb[2]));       
			
			assertEquals(subjectProb[0], result.getCourseName());
			assertEquals(subjectProb[1], result.getCourseCode());
			assertEquals(Integer.parseInt(subjectProb[2]), result.getFullMark());
     
			
			//it.forEachRemaining((student) -> {
			students.forEach((student)-> {	
				/////////////////////////////////////
				 String line;
			     String[] studentProb;
			     try {
			     if ((line = BR.readLine()) != null) {     		
			        studentProb = line.split(",");
			        assertTrue(student_checker.isValid(studentProb[0], studentProb[1], studentProb[2],studentProb[3], studentProb[4],studentProb[5]));    
			        assertEquals(student.getStudentName(), studentProb[0]);
			        assertEquals(student.getStudentID(), studentProb[1]);
			        assertEquals(student.getStudent_activities(), Integer.parseInt(studentProb[2]));
			        assertEquals(student.getStudent_oral(), Integer.parseInt(studentProb[3]));
			        assertEquals(student.getStudent_midterm(), Integer.parseInt(studentProb[4]));
			        assertEquals(student.getStudent_final(), Integer.parseInt(studentProb[5]));
			    } else {
			        fail("number of expected notcorrect!");
			    }
			     } catch (IOException ex) {
			         throw new RuntimeException(ex);
			     }
				/////////////////////////////////////
			});
		}
       
       
       System.out.println("passed.");
   }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(3)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB03() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC03.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC03.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(4)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB04() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC04.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC04.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }		
    
      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(5)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB05() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC05.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC05.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
     
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(6)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB06() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC06.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC06.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(7)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB07() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC07.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC07.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(8)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB08() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC08.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC08.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(9)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB09() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC09.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC09.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(10)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB11() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC10.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC10.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(11)		///////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB10() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC11.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC11.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(12)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB12() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC12.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC12.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(13)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB13() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC13.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC13.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(14)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB14() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC14.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC14.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(15)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB15() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC15.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC15.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(16)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB16() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC16.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC16.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(17)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB17() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC17.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC17.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(18)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB18() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC18.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC18.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(19)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB19() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC19.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC19.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////		Test(20)		///////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	@Test
	 public void testReadFileBB20() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
		
		
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////     Setup     /////////////////////////
		/////////////////////////////////////////////////////////////////
		File myfile = new File("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC20.txt");
		FileReader FR = new FileReader(myfile);
      try (BufferedReader BR = new BufferedReader(FR)) {
			student_validator student_checker = new student_validator();
			course_validator course_checker   = new course_validator();
			FileHandler test1 = new FileHandler("F:\\senior\\2nd\\Testing\\project\\phase1\\phase2\\test cases\\Fa_BBTC20.txt");
			DataAnalyzer analyzer = new DataAnalyzer(test1);
			assertFalse(analyzer.AnalyzeData());
      } catch (IOException ex) {
	         throw new RuntimeException(ex);
	     }

      System.out.println("passed.");
  }
	
}
