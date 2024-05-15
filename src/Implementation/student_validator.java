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
		 if(name.isEmpty())
		 {
			 System.out.println("Invalid name: Name shouldn't be EMPTY\n");          
			 return false;	 
		 } 
		 
		 if (name.startsWith(" "))
		 {
			 System.out.println("Invalid name: Name shouldn't Start with a space\n");
			 return false;	 
		 }
		 
		 int i = 0;
		 while (i < name.length())
		 {
			 char ch = name.charAt(i);   
			 if (!((Character.isLetter(ch)) || (Character.isSpaceChar(ch))))
			 { 
			 
				 System.out.println("Invalid name: Name must be only alphabetic or space\n"); 
			 
				 return false;
			 } 
			 
			 i++; 
		 } 
		 
		 return true; 
		
	 }

    
	 private static boolean validateStudentNumber(String number) {
		    // Validate student number: 8 characters, first 7 digits (0-9), last can be digit or alphabet
		    return number.matches("^\\d{7}[0-9a-zA-Z]$");
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
