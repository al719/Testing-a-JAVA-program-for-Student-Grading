package Implementation;

import java.util.regex.*;

public class student_validator {
	 public static boolean isValid(String name, String number, String activitiesMark, String oralMark, String midtermMark, String finalMark) {
        // Check if the student name is valid
        if (!validateStudentName(name)) {
            System.out.println("Error: Invalid student name - " + name);
            return false;
        }
        
        // Check if the student number is valid
        if (!validateStudentNumber(number)) {
            System.out.println("Error: Invalid student number - " + number);
            return false;
        }
        
        // Check if the student activities mark is valid
        if (!validateMark(activitiesMark, 10)) {
            System.out.println("Error: Invalid activities mark - " + activitiesMark);
            return false;
        }
        
        // Check if the oral/practical mark is valid
        if (!validateMark(oralMark, 10)) {
            System.out.println("Error: Invalid oral/practical mark - " + oralMark);
            return false;
        }
        
        // Check if the midterm exam mark is valid
        if (!validateMark(midtermMark, 20)) {
            System.out.println("Error: Invalid midterm exam mark - " + midtermMark);
            return false;
        }
        
        // Check if the final exam mark is valid
        if (!validateMark(finalMark, 60)) {
            System.out.println("Error: Invalid final exam mark - " + finalMark);
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
