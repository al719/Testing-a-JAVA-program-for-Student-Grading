package testing_prj;

import java.io.FileWriter;
import java.io.IOException;

public class OutputGenerator {

    public void generateOutputFile(Course course) {
        String fileName = course.getCourseName().replaceAll("\\s", "") + ".txt"; // Generate file name from course name
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Subject Name: " + course.getCourseName() + " Max Mark: " + course.getFullMark() + "\n");
            writer.write("Student name Student number GPA Grade\n");

            for (Student student : course.extract()) {
                writer.write(student.getStudentName() + " " + student.getStudentID() + " "
                        + student.getGPA() + " " + student.getGrade() + "\n");
            }

            writer.close();
            System.out.println("Output file generated successfully for course " + course.getCourseName() + ": " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the output file for course " + course.getCourseName() + ": " + e.getMessage());
        }
    }
}
