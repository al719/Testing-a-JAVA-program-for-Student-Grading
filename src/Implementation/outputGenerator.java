package Implementation;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class outputGenerator {
	
	DataAnalyzer data_analyzer;
	Course subject;

    public outputGenerator(FileHandler file) throws FileNotFoundException {
		super();
		data_analyzer = new DataAnalyzer(file);
		data_analyzer.AnalyzeData();
		subject = data_analyzer.extractSubject();
	}


	public void generateOutputFile() {
        String fileName = subject.getCourseName().replaceAll("\\s", "") + ".txt"; // Generate file name from course name
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Subject Name: " + subject.getCourseName() + "\t\t Max Mark: " + subject.getFullMark() + "\n");
            writer.write("Student name \t\t\t Student number \t\t\t GPA \t\t\t Grade\n");

            for (Student student : subject.extract()) {
                writer.write(student.getStudentName() + " \t\t\t\t " + student.getStudentID() + " \t\t\t\t "
                        + student.getGPA() + " \t\t\t " + student.getGrade() + "\n");
            }

            writer.close();
            System.out.println("Output file generated successfully for course " + subject.getCourseName() + ": " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the output file for course " + subject.getCourseName() + ": " + e.getMessage());
        }
    }
}
