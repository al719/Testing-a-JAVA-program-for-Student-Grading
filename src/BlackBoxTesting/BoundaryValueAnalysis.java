package BlackBoxTesting;

import Implementation.Main;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Boundary Value Analysis, the test data is selected on the boundaries of the input domain.
/* Output:
    “Subject Name:” subject-name “Max Mark:” full mark
    The line after contains a head of the table which is:
    Student name Student number GPA Grade
 */
public class BoundaryValueAnalysis {
    // Test boundary conditions for GPA
    @Test
    public void testGPABoundary() throws Exception {
        // Test with maximum GPA
        testBoundaryGPA(4.0);

        // Test with minimum GPA
        testBoundaryGPA(0.0);

        // Test with GPA just beyond the maximum boundary
        testBoundaryGPA(4.1);

        // Test with GPA just beyond the minimum boundary
       // testBoundaryGPA(-0.1);
    }

    // Helper method to test GPA boundary
    private void testBoundaryGPA(double gpa) throws Exception {
        // Prepare input
        String userInput = String.format("C:\\Users\\H P\\Desktop\\Testing-a-JAVA-program-for-Student-Grading\\test cases\\Fa_BBTC01.txt\n4.0\n%s", gpa);
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        // Execute main method
        Main.main(null);

        // Check if output file is generated
        File myfile = new File("AdvancedAlgorithms.txt");
        assertTrue(myfile.exists());

        // Read student data from file
        Scanner scanner = new Scanner(myfile);
        scanner.nextLine(); // Skip subject info
        scanner.nextLine(); // Skip header
        while(scanner.hasNextLine()) {
            String student = scanner.nextLine();
            String[] studentprob = student.split("\t\t\t");
            System.out.println("s"+studentprob[2]);

            // Check if student's GPA matches the input
            assertEquals(gpa, Double.parseDouble(studentprob[2]), 0.01); // Using delta for double comparison
        }
        // Close scanner
        scanner.close();
    }

    // Test boundary conditions for Grade
    @Test
    public void testGradeBoundary() throws Exception {
        // Test with maximum Grade
        testBoundaryGrade("A");

        // Test with minimum Grade
        testBoundaryGrade("F");

        // Test with Grade just beyond the maximum boundary
      //  testBoundaryGrade("AA");

        // Test with Grade just beyond the minimum boundary
     //   testBoundaryGrade("G");
    }

    // Helper method to test Grade boundary
    private void testBoundaryGrade(String grade) throws Exception {
        // Prepare input
        String userInput = String.format("C:\\Users\\H P\\Desktop\\Testing-a-JAVA-program-for-Student-Grading\\test cases\\Fa_BBTC01.txt\nA\n%s", grade);
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        // Execute main method
        Main.main(null);

        // Check if output file is generated
        File myfile = new File("AdvancedAlgorithms.txt");
        assertTrue(myfile.exists());

        // Read student data from file
        Scanner scanner = new Scanner(myfile);
        scanner.nextLine(); // Skip subject info
        scanner.nextLine(); // Skip header
        while(scanner.hasNextLine()) {
            String student = scanner.nextLine();
            String[] studentprob = student.split("\t\t\t");
            System.out.println("s"+studentprob[3]);

            // Check if student's Grade matches the input
            assertEquals(grade.trim(), studentprob[3].trim());
        }
        // Close scanner
        scanner.close();
    }

}

