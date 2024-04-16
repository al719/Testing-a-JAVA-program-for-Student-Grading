
import java.util.regex.*;

public class SubjectValidaton {
    public static boolean validate(String[] subjectData) {
        // Validate subject name
        if (!validateSubjectName(subjectData[0])) {
            System.out.println("Error: Invalid subject name - " + subjectData[0]);
            return false;
        }
        
        // Validate subject code
        if (!validateSubjectCode(subjectData[1])) {
            System.out.println("Error: Invalid subject code - " + subjectData[1]);
            return false;
        }
        
        // Validate full mark
        if (!validateFullMark(subjectData[2])) {
            System.out.println("Error: Invalid full mark - " + subjectData[2]);
            return false;
        }
        
        return true;
    }
    
    private static boolean validateSubjectName(String name) {
        // Validate subject name: Alphabetic characters and Spaces, not starting with space
        return name.matches("[a-zA-Z]+(\\s[a-zA-Z]+)*");
    }
    
    private static boolean validateSubjectCode(String code) {
        // Validate subject code: 6-7 Alphanumeric characters. The first 3 are Alphabetic followed by 3 numeric characters. 
        // The sevens should be 's' if exists.
        return code.matches("[a-zA-Z]{3}\\d{3}s?");
    }
    
    private static boolean validateFullMark(String fullMark) {
        // Validate full mark: Numeric number of 100
        try {
            int markValue = Integer.parseInt(fullMark);
            return markValue == 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
