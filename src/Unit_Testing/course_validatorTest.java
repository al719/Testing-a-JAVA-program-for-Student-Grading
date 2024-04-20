package Unit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Implementation.course_validator;

class course_validatorTest {

	//TEST COURSE NAME
	@Test
	void TestValidCourseName() {
		assertTrue(course_validator.isValid("Software Testing", "ABC321s", "100"));
	}
	@Test
	void TestValidCourseNameWithoutSpace() {
		assertTrue(course_validator.isValid("SoftwareTesting", "ABC321s", "100"));
	}
	@Test
	void TestEmptyName() {
		assertFalse(course_validator.isValid("", "ABC321s", "100"));
	}
	@Test
	void TestNameStartingWithSpace() {
		assertFalse(course_validator.isValid(" Software Testing", "ABC321s", "100"));
	}
	@Test
	void TestNameWithSpecialCaracter() {
		assertFalse(course_validator.isValid("Software_Testing", "ABC321s", "100"));
	}
	@Test
	void TestNameWithNumbers() {
		assertFalse(course_validator.isValid("Software Testing 1", "ABC321s", "100"));
	}
	
	//TEST COURSE CODE
	@Test
	void TestValidCourseCode() {
		assertTrue(course_validator.isValid("Software Testing", "ABC321s", "100"));
	}
	
	@Test
	void TestValidCourseCodewithouts() {
		assertTrue(course_validator.isValid("Software Testing", "ABC321", "100"));
	}
	
	@Test
	void TestCodeWithFourAlphabiticCharacters()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABCD321", "100"));
	}
	
	@Test
	void TestCodeWithFourNumbers()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC3210", "100"));
	}
	
	@Test
	void TestCodeWith5charactersOnly()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC32", "100"));
	}
	
	@Test
	void TestCodeWith8characters()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC321ss", "100"));
	}
	
	@Test
	void TestCodeWith7charactersNotEndingWiths()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC3211", "100"));
	}
	
	@Test
	void TestCodeWithSpecialCaracter()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC_321", "100"));
	}
	
	@Test
	void TestCodeWithcharactersonly()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABCDEF", "100"));
	}
	
	@Test
	void TestCodeWithnumbersonly()
	{
		assertFalse(course_validator.isValid("Software Testing", "123456", "100"));
	}
	
	@Test
	void TestCodeWithSpecialCharacter()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC_12", "100"));
	}
	
	@Test
	void TestCodeWithLastCharacterNots()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC123M", "100"));
	}
	
	@Test
	void TestCodeWithLastCharactersbut6CharactersOnly()
	{
		assertFalse(course_validator.isValid("Software Testing", "ABC12s", "100"));
	}
	
	
	//TEST FULL MARK
	@Test
	void TestValidFullMark() {
		assertTrue(course_validator.isValid("Software Testing", "ABC321", "100"));
	}
	
	@Test
	void TestNegativeFullMark() {
		assertFalse(course_validator.isValid("Software Testing", "ABC321", "-100"));
	}
	
	@Test
	void TestHigherFullMark() {
		assertFalse(course_validator.isValid("Software Testing", "ABC321", "110"));
	}
	
	@Test
	void TestLowerFullMark() {
		assertFalse(course_validator.isValid("Software Testing", "ABC321", "80"));
	}
	
}







