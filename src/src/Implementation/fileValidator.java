package Implementation;
import java.io.IOException;


public class fileValidator {
	//constants representing the expected number of inputs in the subject line and student lines.
    private static final int SUBJECT_LINE_LENGTH = 3;
    private static final int STUDENT_LINE_LENGTH = 6;
    
//The validateLine method takes a line from the input file and its 
//line number as parameters. It splits the line into parts based on commas.
    
    public boolean validateLine(String line, int lineNumber) {
        String[] parts = line.split(",");

        // Check if the line length is valid
        if (lineNumber == 0) { 
            // For the first line (subject line)
            if (parts.length != SUBJECT_LINE_LENGTH) {
                System.out.println("Error: Invalid number of inputs in line " + lineNumber);
                return false;
            }
        } else {
            // For student lines
            if (parts.length != STUDENT_LINE_LENGTH) {
                System.out.println("Error: Invalid number of inputs in line " + lineNumber);
                return false;
            }
        }

        

        return true;
    }
}
