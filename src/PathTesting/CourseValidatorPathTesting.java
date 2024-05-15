package PathTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Implementation.course_validator;

class CourseValidatorPathTesting {

	@Test
	void inValidCourseName() {
		//Name contais special character
		assertFalse(course_validator.isValid("Software_Testing", "ABC321s", "100"));
	}
	@Test
	void inValidCourseCode() {
		//code contains 4 numbers
		assertFalse(course_validator.isValid("Software Testing", "ABC3210", "100"));
	}
	
	@Test
	void inValidFullMark() {
		assertFalse(course_validator.isValid("Software Testing", "ABC321", "80"));
	}
	
	@Test
	void ValidData() {
		assertTrue(course_validator.isValid("Software Testing", "ABC321s", "100"));

	}
}
