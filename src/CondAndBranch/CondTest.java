package CondAndBranch;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import Implementation.Course;
import Implementation.DataAnalyzer;
import Implementation.FileHandler;
import Implementation.course_validator;
import Implementation.fileValidator;
import Implementation.student_validator;

public class CondTest {

    /////////////////////////////////////////////// Testing Course.java ////////////////////////////////////////
    /////// Testing the constructor /////////////

    @Test
    public void testValidInput() {
        // Test with valid inputs
        Course course = new Course("CA", "CSE123s", 100);
        assertTrue(course != null);
    }

    @Test
    public void testNullInput() {
        // Test with null inputs
        try {
            new Course(null, "CSE123s", 100);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

        try {
            new Course("CA", null, 100);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

        try {
            new Course(null, null, 100);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testEmptyInput() {
        // Test with empty inputs
        try {
            new Course("", "CSE123s", 100);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

        try {
            new Course("CA", "", 100);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

        try {
            new Course("", "", 100);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    /////////////////////////////////////// Testing course_validator.java /////////////////

    @Test
    public void isValidCourseWithValidInput() {
        // Test with valid course inputs
        assertTrue(course_validator.isValid("CA", "CSE123s", "100"));
    }

    @Test
    public void CVtestIsValidWithInvalidSubjectName() {
        // Test with invalid subject name
        assertFalse(course_validator.isValid("123", "CSE123s", "100"));
    }

    @Test
    public void CVtestIsValidWithInvalidSubjectCode() {
        // Test with invalid subject code
        assertFalse(course_validator.isValid("CA", "23", "100"));
    }

    @Test
    public void CVtestIsValidWithInvalidFullMark() {
        // Test with invalid full mark
        assertFalse(course_validator.isValid("CA", "CSE123s", "90"));
    }

    ////////////////////////////////// Testing DataAnalyzer.java //////////////////////////



    
    
    @Test
    public void testAnalyzeDataWithInvalidCourse() throws FileNotFoundException {
        // Test with invalid course data
    	FileHandler fileHandler = new FileHandler("C:/Users/S0nd0/OneDrive/Desktop/Senior2-2nd sem/testing/project/Testing-a-JAVA-program-for-Student-Grading-phase2/src/CondAndBranch/invalid_course.txt");
    	DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);

        boolean result = dataAnalyzer.AnalyzeData();
        System.out.println("AnalyzeData result: " + result);  // Debugging output
        assertFalse(result);
    }
    

   
    ///////////////////////////////////////// File Handler.java ////////////////////////////

    @Test
    public void testGetDataWithValidFile() throws FileNotFoundException {
        // Test with valid file data
        FileHandler fileHandler = new FileHandler("C:/Users/S0nd0/OneDrive/Desktop/Senior2-2nd sem/testing/project/Testing-a-JAVA-program-for-Student-Grading-phase2/src/CondAndBranch/test.txt");
        ArrayList<String> data = fileHandler.GetData();
        assertTrue(data != null);
        assertFalse(data.isEmpty());
    }

    @Test
    public void testGetDataWithInvalidFile() {
        // Test with invalid file
        try {
            FileHandler fileHandler = new FileHandler("/src/CondAndBranch/tt.txt");
            fileHandler.GetData();
            assertFalse(true);
        } catch (FileNotFoundException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testGetDataWithInvalidLineFormat() throws FileNotFoundException {
        // Test with invalid line format
        FileHandler fileHandler = new FileHandler("/src/CondAndBranch/invalid_line.txt");
        ArrayList<String> data = null;
        try {
            data = fileHandler.GetData();
        } catch (Exception e) {
            // Handle exception
        }
        assertTrue(data == null);
    }
    
    
    
    
    @Test
    public void testFileHandlerConstructor() {
        try {
            FileHandler fileHandler = new FileHandler();
            assertNotNull(fileHandler);
            assertTrue(fileHandler.getData_in().isEmpty());
            assertNotNull(fileHandler.getFile_validator());
        } catch (FileNotFoundException e) {
            fail("FileNotFoundException should not be thrown");
        }
    }

   


    ///////////////////////////////////////// FileValidator.java ////////////////////////////

    @Test
    public void testValidateSubjectLineWithValidLength() {
        // Test subject line validation with valid length
        fileValidator validator = new fileValidator();
        assertTrue(validator.validateLine("CA,CSE123s,100", 0));
    }

    @Test
    public void testValidateSubjectLineWithInvalidLength() {
        // Test subject line validation with invalid length
        fileValidator validator = new fileValidator();
        assertFalse(validator.validateLine("CA,CSE123s", 0));
    }

    @Test
    public void testValidateStudentLineWithValidLength() {
        // Test student line validation with valid length
        fileValidator validator = new fileValidator();
        assertTrue(validator.validateLine("omar,1900949,10,10,19,56", 1));
    }

    @Test
    public void testValidateStudentLineWithInvalidLength() {
        // Test student line validation with invalid length
        fileValidator validator = new fileValidator();
        assertFalse(validator.validateLine("omar,10,10,19,56", 1));
    }

    ///////////////////////////////////////// student Validator.java ////////////////////////////

    @Test
    public void testIsValidWithValidData() {
        // Valid data: Student name, number, and marks within valid ranges
        String name = "OMAR";
        String number = "1234567A"; // Assuming valid student number
        String activitiesMark = "10"; // Assuming valid activities mark
        String oralMark = "8"; // Assuming valid oral/practical mark
        String midtermMark = "18"; // Assuming valid midterm exam mark
        String finalMark = "50"; // Assuming valid final exam mark
        
        // Assertion: Validate that isValid returns true for valid data
        assertTrue(student_validator.isValid(name, number, activitiesMark, oralMark, midtermMark, finalMark));
    }
    @Test
    public void testIsValidWithInvalidName() {
        // Test student data validation with invalid name
        assertFalse(student_validator.isValid("12", "1900949", "10", "10", "19", "56"));
    }

    @Test
    public void testIsValidWithInvalidNumber() {
        // Test student data validation with invalid number
        assertFalse(student_validator.isValid("omar", "19", "10", "10", "19", "56"));
    }

    @Test
    public void testIsValidWithInvalidActivitiesMark() {
        // Test student data validation with invalid activities mark
        assertFalse(student_validator.isValid("omar", "1900949", "1000", "10", "19", "56"));
    }

    @Test
    public void testIsValidWithInvalidOralMark() {
        // Test student data validation with invalid oral mark
        assertFalse(student_validator.isValid("omar", "1900949", "10", "1000", "19", "56"));
    }

    @Test
    public void testIsValidWithInvalidMidtermMark() {
        // Test student data validation with invalid midterm mark
        assertFalse(student_validator.isValid("omar", "1900949", "10", "10", "190", "56"));
    }

    @Test
    public void testIsValidWithInvalidFinalMark() {
        // Test student data validation with invalid final mark
        assertFalse(student_validator.isValid("omar", "1900949", "10", "10", "19", "560"));
    }
    
    
    @Test
    public void testValidateStudentNumber_ValidNumber() {
        assertTrue(student_validator.isValid("John Doe", "1234567A", "10", "10", "10", "40"));
    }

    @Test
    public void testValidateStudentNumber_InvalidNumber() {
        assertFalse(student_validator.isValid("John Doe", "12678", "10", "10", "10", "40"));
    }

    @Test
    public void testValidateActivitiesMark_ValidMark() {
        assertTrue(student_validator.isValid("John Doe", "1234567A", "10", "10", "10", "40"));
    }

    @Test
    public void testValidateActivitiesMark_InvalidMark() {
        assertFalse(student_validator.isValid("John Doe", "1234567A", "11", "10", "10", "40"));
    }

    @Test
    public void testValidateOralMark_ValidMark() {
        assertTrue(student_validator.isValid("John Doe", "1234567A", "10", "10", "10", "40"));
    }

    @Test
    public void testValidateOralMark_InvalidMark() {
        assertFalse(student_validator.isValid("John Doe", "1234567A", "10", "11", "10", "40"));
    }

    @Test
    public void testValidateMidtermMark_ValidMark() {
        assertTrue(student_validator.isValid("John Doe", "1234567A", "10", "10", "20", "40"));
    }

    @Test
    public void testValidateMidtermMark_InvalidMark() {
        assertFalse(student_validator.isValid("John Doe", "1234567A", "10", "10", "21", "40"));
    }

    @Test
    public void testValidateFinalMark_ValidMark() {
        assertTrue(student_validator.isValid("John Doe", "1234567A", "10", "10", "10", "60"));
    }

    @Test
    public void testValidateFinalMark_InvalidMark() {
        assertFalse(student_validator.isValid("John Doe", "1234567A", "10", "10", "10", "61"));
    }
    
    
    @Test
    public void testValidateMark_ValidMark() {
        assertTrue(student_validator.validateMark("10", 20));
    }

    @Test
    public void testValidateMark_InvalidMark() {
        assertFalse(student_validator.validateMark("-5", 20));
    }

    @Test
    public void testValidateMark_NonIntegerMark() {
        assertFalse(student_validator.validateMark("abc", 20));
    }
    
    @Test
    void TestGPA4() throws FileNotFoundException {
        FileHandler filehandle = new FileHandler("..\\test_sample.txt");
        DataAnalyzer TestData = new DataAnalyzer(filehandle);
        assertEquals(4, TestData.GPA_Evaluation("A"), "Fail::GPA is not as expected");
    }

    @Test
    void TestGPA37() throws FileNotFoundException {
        FileHandler filehandle = new FileHandler("..\\test_sample.txt");
        DataAnalyzer TestData = new DataAnalyzer(filehandle);
        assertEquals(3.7, TestData.GPA_Evaluation("A-"), "Fail::GPA is not as expected");
    }

    @Test
    void TestGPA33() throws FileNotFoundException {
        FileHandler filehandle = new FileHandler("..\\test_sample.txt");
        DataAnalyzer TestData = new DataAnalyzer(filehandle);
        assertEquals(3.3, TestData.GPA_Evaluation("B+"), "Fail::GPA is not as expected");
    }

}
