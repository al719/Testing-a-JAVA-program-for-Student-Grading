package Implementation;

public class Student {
		
	
	/*********************************** Data Fields *********************************/
	
	private String studentName;
	private String studentID;
	
	private int student_activities;
	private int student_oral;
	private int student_midterm;
	private int student_final;
	
	private double GPA;
	private String Grade;
	
	
	/******************************* Constructor *************************************/
	
	public Student(String studentName, String studentID, int student_activities, int student_oral, int student_midterm,
			int student_final, double gpa, String grade) {
		
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.student_activities = student_activities;
		this.student_oral = student_oral;
		this.student_midterm = student_midterm;
		this.student_final = student_final;
		GPA = gpa;
		Grade = grade;
	}
	
	
	/******************************* Setters *************************************/
	
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
	

	/******************************* Getters *************************************/
	
	
	public String getStudentName() {
		return studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public int getStudent_activities() {
		return student_activities;
	}

	public int getStudent_oral() {
		return student_oral;
	}

	public int getStudent_midterm() {
		return student_midterm;
	}

	public int getStudent_final() {
		return student_final;
	}

	public double getGPA() {
		return GPA;
	}

	public String getGrade() {
		return Grade;
	}
	
}
