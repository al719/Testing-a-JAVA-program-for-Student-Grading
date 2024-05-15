package integration_testing.level_3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;
import Implementation.DataAnalyzer;
import Implementation.FileHandler;

class DataAnalyzerTest {

	@Test
	void TestGPA4() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(4,TestData.GPA_Evaluation("A"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA37() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(3.7,TestData.GPA_Evaluation("A-"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA33() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(3.3,TestData.GPA_Evaluation("B+"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA3() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(3,TestData.GPA_Evaluation("B"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA27() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(2.7,TestData.GPA_Evaluation("B-"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA23() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(4,TestData.GPA_Evaluation("A"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA2() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(2,TestData.GPA_Evaluation("C"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA17() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(1.7,TestData.GPA_Evaluation("C-"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA13() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(1.3,TestData.GPA_Evaluation("D+"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA1() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(1,TestData.GPA_Evaluation("D"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA0() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("..\\test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(0,TestData.GPA_Evaluation("F"),"Fail::GPA is not as expected");
	}
	
	// Test cases for A+
	@Test
	void TestGradeAPlus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A+", TestData.Grade_Evaluation(10,10,20,59), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeAPlusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A+", TestData.Grade_Evaluation(10,10,20,60), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeAPlusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A+", TestData.Grade_Evaluation(10,10,20, 57), "Fail::Grade is not as expected");
	}

	// Test cases for A
	@Test
	void TestGradeA() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A", TestData.Grade_Evaluation(10,10,20 ,54), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeAWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A", TestData.Grade_Evaluation(10,10,20 ,56), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeAWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A", TestData.Grade_Evaluation(10,10,20, 53), "Fail::Grade is not as expected");
	}

	// Test cases for A-
	@Test
	void TestGradeAMinus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A-", TestData.Grade_Evaluation(10,10,20 ,49), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeAMinusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A-", TestData.Grade_Evaluation(10,10,20 ,52), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeAMinusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("A-", TestData.Grade_Evaluation(10,10,20 ,49), "Fail::Grade is not as expected");
	}
	// Test cases for B+
	@Test
	void TestGradeBPlus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B+", TestData.Grade_Evaluation(10,10,20 ,44), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeBPlusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B+", TestData.Grade_Evaluation(10,10,20,48), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeBPlusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B+", TestData.Grade_Evaluation(10,10,20,44), "Fail::Grade is not as expected");
	}

	// Test cases for B
	@Test
	void TestGradeB() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B", TestData.Grade_Evaluation(10,10,20,42), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeBWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B", TestData.Grade_Evaluation(10,10,20 ,43), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeBWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B", TestData.Grade_Evaluation(10,10,20 ,40), "Fail::Grade is not as expected");
	}

	// Test cases for B-
	@Test
	void TestGradeBMinus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B-", TestData.Grade_Evaluation(10,10,20 ,36), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeBMinusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B-", TestData.Grade_Evaluation(10,10,20 ,39), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeBMinusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("B-", TestData.Grade_Evaluation(10,10,20,36), "Fail::Grade is not as expected");
	}
	// Test cases for C
	@Test
	void TestGradeC() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C", TestData.Grade_Evaluation(10,10,20,32), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeCWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C", TestData.Grade_Evaluation(10,10,20 ,32), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeCWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C", TestData.Grade_Evaluation(10,10,20 ,30), "Fail::Grade is not as expected");
	}

	// Test cases for C+
	@Test
	void TestGradeCPlus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C+", TestData.Grade_Evaluation(10,10,20 ,34), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeCPlusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C+", TestData.Grade_Evaluation(10,10,20 ,35), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeCPlusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C+", TestData.Grade_Evaluation(10,10,20,33), "Fail::Grade is not as expected");
	}

	// Test cases for C-
	@Test
	void TestGradeCMinus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C-", TestData.Grade_Evaluation(10,10,20 ,29), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeCMinusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C-", TestData.Grade_Evaluation(10,10,20 ,27), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeCMinusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("C-", TestData.Grade_Evaluation(10,10,20 ,29), "Fail::Grade is not as expected");
	}
	// Test cases for D
	@Test
	void TestGradeD() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("D", TestData.Grade_Evaluation(10,10,20 ,23), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeDWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("D", TestData.Grade_Evaluation(10,10,20 ,23), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeDWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("D", TestData.Grade_Evaluation(10,10,20,20), "Fail::Grade is not as expected");
	}

	// Test cases for D+
	@Test
	void TestGradeDPlus() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("D+", TestData.Grade_Evaluation(10,10,20,26), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeDPlusWithUpperLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("D+", TestData.Grade_Evaluation(10,10,20,26), "Fail::Grade is not as expected");
	}

	@Test
	void TestGradeDPlusWithLowerLimit() throws FileNotFoundException 
	{
	    FileHandler filehandle = new FileHandler("..\\test_sample.txt");
	    DataAnalyzer TestData = new DataAnalyzer(filehandle);
	    assertEquals("D+", TestData.Grade_Evaluation(10,10,20 ,24), "Fail::Grade is not as expected");
	}

	


}











