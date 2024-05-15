package BlackBoxTesting;

import Implementation.Main;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoundaryValueAnalysis {
    // Test boundary conditions for GPA
    @Test
    public void testGPABoundary() throws Exception {

        testBoundaryGPA(new ArrayList<Double>() {{ add(0.0); add(4.0); add(0.0);
            add(0.0); add(0.0); add(0.0); add(1.0);}});


    }

    // Helper method to test GPA boundary
    private void testBoundaryGPA(ArrayList<Double> gpa) throws Exception {
        // Prepare input
        String userInput = String.format("C:\\Users\\H P\\Desktop\\Testing-a-JAVA-program-for-Student-Grading\\test cases\\Fa_Int.txt\n4.0\n%s", gpa);
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
        int i=0;
        while(scanner.hasNextLine()) {
            // Read the first student line
            String student = scanner.nextLine();
            String[] studentprob = student.split("\t\t\t");

            // Check if student's GPA matches the input
            assertEquals(gpa.get(i), Double.parseDouble(studentprob[2]), 0.01); // Using delta for double comparison
            i++;
        }
        // Close scanner
        scanner.close();
    }

    // Test boundary conditions for Grade
    @Test
    public void testGradeBoundary() throws Exception {
        // Test with maximum Grade
        testBoundaryGrade(new ArrayList<String>() {{ add(" F"); add(" A+"); add(" F");
            add(" F"); add(" F"); add(" F"); add(" D");
        }});


    }

    // Helper method to test Grade boundary
    private void testBoundaryGrade(ArrayList<String> grade) throws Exception {
        // Prepare input
        String userInput = String.format("C:\\Users\\H P\\Desktop\\Testing-a-JAVA-program-for-Student-Grading\\test cases\\Fa_Int.txt\nA\n%s", grade);
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
        int i = 0;
        while (scanner.hasNextLine()) {
            // Read the first student line
            String student = scanner.nextLine();
            String[] studentprob = student.split("\t\t\t");

            // Check if student's Grade matches the input
            assertEquals(grade.get(i), studentprob[3]);
            i++;
        }

        // Close scanner
        scanner.close();
    }
}
