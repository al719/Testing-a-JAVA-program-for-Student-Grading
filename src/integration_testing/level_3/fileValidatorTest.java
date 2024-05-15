package integration_testing.level_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Implementation.fileValidator;

public class fileValidatorTest {

    @Test
    public void testValidSubjectLine() {
        fileValidator validator = new fileValidator();
        assertTrue(validator.validateLine("Mathematics,CSE215s,100", 0));
    }

    @Test
    public void testInvalidSubjectLine() {
        fileValidator validator = new fileValidator();
        assertFalse(validator.validateLine("Mathematics,100", 0));
        assertFalse(validator.validateLine("Mathematics,CSE215s,100,Extra", 0));
    }

    @Test
    public void testValidStudentLine() {
        fileValidator validator = new fileValidator();
        assertTrue(validator.validateLine("Youssef Ahmed,1900124,8,9,18,45", 1));
    }

    @Test
    public void testInvalidStudentLine() {
        fileValidator validator = new fileValidator();
        assertFalse(validator.validateLine("Youssef,8,9,18", 1));
        assertFalse(validator.validateLine("Youssef Ahmed,1900124,8,9,18,45,Extra", 1));
    }
    
    @Test
    public void testValidStudent_LineNumber2()
    {
        fileValidator validator = new fileValidator();
        assertTrue(validator.validateLine("Youssef Ahmed,1900124,8,9,18,45", 2));
    }
    
    @Test
    public void testValidStudent_LineNumber1000()
    {
        fileValidator validator = new fileValidator();
        assertTrue(validator.validateLine("Youssef Ahmed,1900124,8,9,18,45", 1000));
    }
}