package Unit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Implementation.student_validator;

class student_validatorTest {

	@Test
	void testEmptyStudentName() {
		assertFalse(student_validator.isValid("", null, null, null, null, null));
	}
	@Test
	void testOnlySpacesStudentName() {
		assertFalse(student_validator.isValid("  ", null, null, null, null, null));
	}
	@Test
	void testStudentNameStartingWithSpace() {
		assertFalse(student_validator.isValid(" Mohamad", null, null, null, null, null));
	}
	
	@Test
	void testStudentNameWithSpecialCharacter() {
		assertFalse(student_validator.isValid("Moh@mad", null, null, null, null, null));
	}
	
	@Test
	void testStudentNameWithNumber() {
		assertFalse(student_validator.isValid("Mohamad 4", null, null, null, null, null));
	}
	

	@Test
	void testStudentNumberLengthLessThan8 () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567", null, null, null, null),"Student number less than 8");
	}
	@Test
	void testStudentNumberLengthMoreThan8 () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567MR", null, null, null, null),"Student number less than 8");
	}
	
	
	@Test
	void testStudentNumberWithManyLetters () {
		assertFalse(student_validator.isValid("Amr Ahmad", "123R567M", null, null, null, null),"Student number may contain only one trailing letter");
	}
	
	@Test
	void testActivityMarkNegative () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "-4", null, null, null),"Activity mark must be a positive value");
	}
	@Test
	void testActivityMarkMoreThan10 () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "12", null, null, null),"Student number may contain only one trailing letter");
	}
	@Test
	void testActivityMark10 () {
		assertTrue(student_validator.isValid("Amr Ahmad", "1234567M", "10", "1", "10", "1"),"Student number may contain only one trailing letter");
	}
	@Test
	void testOralMarkMoreThan10 () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "10", "11", "10", "1"),"Student number may contain only one trailing letter");
	}
	@Test
	void testMidtermMarkMoreThan20 () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "10", "10", "21", "1"),"Student number may contain only one trailing letter");
	}
	@Test
	void testFinalMarkMoreThan60 () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "10", "21", "10", "61"),"Student number may contain only one trailing letter");
	}
	@Test
	void testStudentIdWithLetter() {
		assertTrue(student_validator.isValid("Amr Ahmad", "1234567M", "5", "0", "10", "60"),"Student number may contain only one trailing letter");
	}
	@Test
	void testStudentIdWithNoLetter() {
		assertTrue(student_validator.isValid("Amr Ahmad", "12345678", "5", "0", "10", "60"));
	}
	
	@Test
	void testStudentNameTrailingSpace() {
		assertTrue(student_validator.isValid("Amr Ahmad ", "12345678", "5", "0", "10", "60"));
	}

	@Test
	void testStudentNameAllUpperCase() {
		assertTrue(student_validator.isValid("MARWA AMR", "12345678", "5", "0", "10", "60"));
	}
	
	@Test
	void testStudentNameAllLowerCase() {
		assertTrue(student_validator.isValid("marwa amr", "12345678", "5", "0", "10", "60"));
	}
	

	@Test
	void testStudentNamePascal() {
		assertTrue(student_validator.isValid("MarwaAmr", "12345678", "5", "0", "10", "60"));
	}
	@Test
	void testStudentNamePascalWithSpace() {
		assertTrue(student_validator.isValid("Amr Mohamad", "1234567M", "5", "0", "10", "60"));
	}
	
	@Test
	void testStudentNameCamalCase() {
		assertTrue(student_validator.isValid("marwaAmr", "12345678", "5", "0", "10", "60"));
	}
	@Test
	void testStudentNameCamalCaseWithSpace() {
		assertTrue(student_validator.isValid("marwa Amr", "12345678", "5", "0", "10", "60"));
	}
	@Test
	void testStudentSecondNameLowerCase() {
		assertTrue(student_validator.isValid("Marwa amr", "12345678", "5", "0", "10", "60"));
	}
	
	
	
}
