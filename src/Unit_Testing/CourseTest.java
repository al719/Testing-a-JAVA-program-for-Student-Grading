package Unit_Testing;
import static org.junit.jupiter.api.Assertions.*;

import Implementation.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Implementation.Course;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;

public class CourseTest {
    private static Course course;
    private static Student student1;
    private static Student student2;

    @BeforeAll
    public static void setUp() {
        course = new Course("Math", "MATH101", 100);
        student1 = new Student("Youssef Ahmed", "1900124", 10,3,12,56,2.8,"A" );
        student2 = new Student("Ahmed", "1901202", 10,3,12,56, 2.7, "B" );
    }

    @Test
    public void testGetters() {

        assertEquals("Math", course.getCourseName());
        assertEquals("MATH101", course.getCourseCode());
        assertEquals(100, course.getFullMark());
    }

    @Test
    public void testSetters() {
        course.setCourseName("English");
        course.setCourseCode("ENG101");
        course.setFullMark(90);

        assertEquals("English", course.getCourseName());
        assertEquals("ENG101", course.getCourseCode());
        assertEquals(90, course.getFullMark());
    }

    @Test
    public void testAddStudent() {
        course.addStudent(student1);
        course.addStudent(student2);

        ArrayList<Student> students = course.extract();
        assertEquals(2, students.size());
        assertTrue(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    public void testToString() {
        String expected = "Course [courseName=Math, courseCode=MATH101, fullMark=100, students=[]]";
        assertEquals(expected, course.toString());
    }

    @Test
    public void testExtract() {
        ArrayList<Student> students1 = course.extract();
        ArrayList<Student> students2 = course.extract();

        assertSame(students1, students2); // Ensure different references
        assertEquals(students1, students2); // Ensure same elements
    }

    @Test
    public void testNullCourseName() {
        assertThrows(IllegalArgumentException.class, () -> new Course(null, "MATH101", 100));
    }
}

