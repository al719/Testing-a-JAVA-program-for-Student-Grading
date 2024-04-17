package testing_prj;

import java.util.regex.*;

public class course_validator {
	public static boolean isValid(String subjectName, String subjectCode, String fullMark) {
        // Validate subject name
        if (!validateSubjectName (subjectName)) {
            System.out.println("Error: Invalid subject name - " + subjectName);
            return false;
        }
        
        // Validate subject code
        if (!validateSubjectCode(subjectCode)) {
            System.out.println("Error: Invalid subject code - " + subjectCode);
            return false;
        }
        
        // Validate full mark
        if (!validateFullMark(fullMark)) {
            System.out.println("Error: Invalid full mark - " + fullMark);
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
