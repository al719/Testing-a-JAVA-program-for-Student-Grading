
import java.util.regex.*;

public class StudentValidation {
    public static boolean validate(String[] studentData) {
        // Check if the student name is valid
        if (!validateStudentName(studentData[0])) {
            System.out.println("Error: Invalid student name - " + studentData[0]);
            return false;
        }
        
        // Check if the student number is valid
        if (!validateStudentNumber(studentData[1])) {
            System.out.println("Error: Invalid student number - " + studentData[1]);
            return false;
        }
        
        // Check if the student activities mark is valid
        if (!validateMark(studentData[2], 10)) {
            System.out.println("Error: Invalid activities mark - " + studentData[2]);
            return false;
        }
        
        // Check if the oral/practical mark is valid
        if (!validateMark(studentData[3], 10)) {
            System.out.println("Error: Invalid oral/practical mark - " + studentData[3]);
            return false;
        }
        
        // Check if the midterm exam mark is valid
        if (!validateMark(studentData[4], 20)) {
            System.out.println("Error: Invalid midterm exam mark - " + studentData[4]);
            return false;
        }
        
        // Check if the final exam mark is valid
        if (!validateMark(studentData[5], 60)) {
            System.out.println("Error: Invalid final exam mark - " + studentData[5]);
            return false;
        }
        
        return true;
    }
    
    private static boolean validateStudentName(String name) {
        // Validate student name: Alphabetic characters and Spaces, not starting with space
        return name.matches("[a-zA-Z]+(\\s[a-zA-Z]+)*");
        // mohammed
        // mohammed moustafa
        //mohammed moustafa sayed
        
    }
    
    private static boolean validateStudentNumber(String number) {
        // Validate student number: Alphanumeric characters of exact length of 8 characters,
        // starting with numbers and might end with only one alphabetic character
        return number.matches("\\d{7}[a-zA-Z]?");
    }
    
    private static boolean validateMark(String mark, int maxMark) {
        // Validate mark: Integer of a value from 0 up to maxMark
        try {
            int markValue = Integer.parseInt(mark);
            return markValue >= 0 && markValue <= maxMark;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
