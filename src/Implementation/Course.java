package Implementation;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Course {
	
	/******************************* Data Fields *************************************/
	
	private String courseName = "";
	private String courseCode = "";
	private int fullMark;
//	private Course subject;
//	private outputGenerator out = new outputGenerator();
//	private DataAnalyzer datanalyzer ;
	
	
	ArrayList<Student> students = new ArrayList<Student>();

	
	/******************************* Constructor *************************************/
	
	public Course(String courseName, String courseCode, int fullMark) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.fullMark = fullMark;
//		this.subject = subject;
//		datanalyzer = new DataAnalyzer();
	}
	
	
	/******************************* Setters *************************************/
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public void setFullMark(int fullMark) {
		this.fullMark = fullMark;
	}
	
//	public void setCourse(Course subject) {
//		this.subject = subject;
//	}
	
	
	/******************************* Getters *************************************/

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
	

	/******************************* Methods *************************************/

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", fullMark=" + fullMark
				+ ", students=" + students + "]";
	}
	
	
}
