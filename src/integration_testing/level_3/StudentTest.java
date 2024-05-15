package integration_testing.level_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import Implementation.Student;

class StudentTest {

	@Test
	void testSettersAndGetters() {
		

        Student student = new Student("Youssef Ahmed", "1900124", 80, 85, 75, 90, 3.6, "A");

        assertEquals("Youssef Ahmed", student.getStudentName(), "Student Fail::getStudentName");
        assertEquals("1900124", student.getStudentID(), "Student Fail::getStudentID");
        assertEquals(80, student.getStudent_activities(), "Student Fail::getStudent_activities");
        assertEquals(85, student.getStudent_oral(), "Student Fail::getStudent_oral");
        assertEquals(75, student.getStudent_midterm(), "Student Fail::getStudent_midterm");
        assertEquals(90, student.getStudent_final(), "Student Fail::getStudent_final");
        assertEquals(3.6, student.getGPA(), "Student Fail::getGPA");
        assertEquals("A", student.getGrade(), "Student Fail::getGrade");

        student.setStudentName("Hady Ibrahim");
        student.setStudentID("1901122");
        student.setStudent_activities(75);
        student.setStudent_oral(80);
        student.setStudent_midterm(85);
        student.setStudent_final(95);
        student.setGPA(3.8);
        student.setGrade("A+");

        assertEquals("Hady Ibrahim", student.getStudentName(), "Student Fail::setStudentName");
        assertEquals("1901122", student.getStudentID(), "Student Fail::setStudentID");
        assertEquals(75, student.getStudent_activities(), "Student Fail::setStudent_activities");
        assertEquals(80, student.getStudent_oral(), "Student Fail::setStudent_oral");
        assertEquals(85, student.getStudent_midterm(), "Student Fail::setStudent_midterm");
        assertEquals(95, student.getStudent_final(), "Student Fail::setStudent_final");
        assertEquals(3.8, student.getGPA(), "Student Fail::setGPA");
        assertEquals("A+", student.getGrade(), "Student Fail::setGrade");
	}

}
