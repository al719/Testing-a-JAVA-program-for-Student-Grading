package testing_prj;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Course {
	private String courseName = "";
	private String courseCode = "";
	private int fullMark;
//	private Course subject;
//	private outputGenerator out = new outputGenerator();
//	private DataAnalyzer datanalyzer ;
	ArrayList<Student> students = new ArrayList<Student>();

	
	public Course(String courseName, String courseCode, int fullMark) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.fullMark = fullMark;
//		this.subject = subject;
//		datanalyzer = new DataAnalyzer();
	}

	public String getCourseName() {
		return courseName;
	}


	public String getCourseCode() {
		return courseCode;
	}


	public int getFullMark() {
		return fullMark;
	}

	public void addStudent(Student s) {
		students.add(s);
	}
	
	public ArrayList<Student> extract(){
		return students;
	}
	


	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", fullMark=" + fullMark
				+ ", students=" + students + "]";
	}
	
	
}
