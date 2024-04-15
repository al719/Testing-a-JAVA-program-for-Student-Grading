package testing_prj;

public class Student_Builder {
	/////////////// Data Fields
	private String studentName;
	private String studentID;
	
	private int student_activities;
	private int student_oral;
	private int student_midterm;
	private int student_final;
	
	private double GPA;
	private String Grade;
	
	public Student_Builder(String studentName, String studentID, int student_activities, int student_oral,
			int student_midterm, int student_final, double gPA, String grade) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.student_activities = student_activities;
		this.student_oral = student_oral;
		this.student_midterm = student_midterm;
		this.student_final = student_final;
		GPA = gPA;
		Grade = grade;
	}
	/////////////// Data Members
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public void setStudent_activities(int student_activities) {
		this.student_activities = student_activities;
	}
	public void setStudent_oral(int student_oral) {
		this.student_oral = student_oral;
	}
	public void setStudent_midterm(int student_midterm) {
		this.student_midterm = student_midterm;
	}
	public void setStudent_final(int student_final) {
		this.student_final = student_final;
	}
	
	
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
	public Student build() {
		return new Student(studentName,studentID,student_activities,student_oral,student_midterm,student_final,GPA,Grade);
	}
	
	
	
	
}
