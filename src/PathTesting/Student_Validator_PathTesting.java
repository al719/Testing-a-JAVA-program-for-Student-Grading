package PathTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Implementation.student_validator;

class Student_Validator_PathTesting {

	@Test
	void ValidStudentData() {
		assertTrue(student_validator.isValid("marwa Amr", "12345678", "5", "0", "10", "60"));
	}
	@Test
	void INvalidName() {
		assertFalse(student_validator.isValid("Mohamad 4", null, null, null, null, null));
	}
	@Test
	void InvalidOralMark () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "10", "11", "10", "1"),"Student number may contain only one trailing letter");
	}
	void InvalidMidtermMark () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "10", "10", "21", "1"),"Student number may contain only one trailing letter");
	}
	void InvalidFinalMark () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "10", "20", "10", "61"),"Student number may contain only one trailing letter");
	}
	void InvalidActivityMark () {
		assertFalse(student_validator.isValid("Amr Ahmad", "1234567M", "11", "20", "10", "60"),"Student number may contain only one trailing letter");
	}
	void InvalidID() {
		assertTrue(student_validator.isValid("Amr Ahmad", "1234567M", "5", "0", "10", "60"),"Student number may contain only one trailing letter");
	}

}
