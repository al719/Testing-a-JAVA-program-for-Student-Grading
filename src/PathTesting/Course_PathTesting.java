package PathTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Implementation.*;
class Course_PathTesting {

	@Test
	 public void testConstructorWithNullValues() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Course(null, "CS101", 100);
	        });
	        
	        
	    }
	
	@Test
	 public void TestCorrectCourseData() 
	 {
		 // This test should not throw an exception
        Course course = new Course("Math", "CODE123", 100);
        assertNotNull(course);
	 }
}
