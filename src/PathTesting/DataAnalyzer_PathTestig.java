package PathTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import Implementation.DataAnalyzer;
import Implementation.FileHandler;

class DataAnalyzer_PathTestig {

	//GPA TESTING 
	@Test
	void TestGPA4() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(4,TestData.GPA_Evaluation("A"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA37() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(3.7,TestData.GPA_Evaluation("A-"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA33() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(3.3,TestData.GPA_Evaluation("B+"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA3() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(3,TestData.GPA_Evaluation("B"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA27() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(2.7,TestData.GPA_Evaluation("B-"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA23() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(4,TestData.GPA_Evaluation("A"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA2() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(2,TestData.GPA_Evaluation("C"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA17() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(1.7,TestData.GPA_Evaluation("C-"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA13() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(1.3,TestData.GPA_Evaluation("D+"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA1() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(1,TestData.GPA_Evaluation("D"),"Fail::GPA is not as expected");
	}
	@Test
	void TestGPA0() throws FileNotFoundException 
	{
		FileHandler filehandle = new FileHandler("test_sample.txt");
		DataAnalyzer TestData = new DataAnalyzer(filehandle);
		assertEquals(0,TestData.GPA_Evaluation("F"),"Fail::GPA is not as expected");
	}

}
