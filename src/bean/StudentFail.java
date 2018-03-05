package bean;

public class StudentFail{
	String studentID;
	String name;
	int failsum;
	float sumCredit;
	float creditPass;
	float creditFail;
	float gradpoint;
	String major;
	String grade;
	String className;
	
	public StudentFail() {
		super();
		this.studentID = "";
		this.name = "";
		this.failsum = 0;
		this.sumCredit = 0;
		this.creditPass = 0;
		this.creditFail = 0;
		this.gradpoint = 0;
		this.major = "";
		this.grade = "";
		this.className="";
	}
	public StudentFail(String studentID, String name, int failsum, float sumCredit, float creditPass, float creditFail,
			float gradpoint, String major, String grade,String className) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.failsum = failsum;
		this.sumCredit = sumCredit;
		this.creditPass = creditPass;
		this.creditFail = creditFail;
		this.gradpoint = gradpoint;
		this.major = major;
		this.grade = grade;
		this.className=className;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFailsum() {
		return failsum;
	}
	public void setFailsum(int failsum) {
		this.failsum = failsum;
	}
	public float getSumCredit() {
		return sumCredit;
	}
	public void setSumCredit(float sumCredit) {
		this.sumCredit = sumCredit;
	}
	public float getCreditPass() {
		return creditPass;
	}
	public void setCreditPass(float creditPass) {
		this.creditPass = creditPass;
	}
	public float getCreditFail() {
		return creditFail;
	}
	public void setCreditFail(float creditFail) {
		this.creditFail = creditFail;
	}
	public float getGradpoint() {
		return gradpoint;
	}
	public void setGradpoint(float gradpoint) {
		this.gradpoint = gradpoint;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
