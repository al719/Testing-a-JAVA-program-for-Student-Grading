package testing_prj;

public class Course_Builder {
	
	////////////// Data Fields
	private String courseName = "";
	private String courseCode = "";
	private int fullMark;
	
	//private ArrayList<Student> students = 
	
	////////////// Data Members
	
	public Course_Builder(String subject_name , String subject_code , int fullMark) {
		// TODO Auto-generated constructor stub
		this.courseCode = subject_code;
		this.courseName = subject_name;
		this.fullMark   = fullMark; 
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public void setFullMark(int fullMark) {
		this.fullMark = fullMark;
	}
	
	public Course build() {
		return new Course(courseName,courseCode,fullMark);
	}
	
	
	
}
