package bean;

public class GradeInfo implements Comparable{
	String studentID;
	String name;
	float sumCredit;
	float creditPass;
	float creditFail;
	float gradpoint;
	String major;
	public GradeInfo(){
		super();
		this.studentID="";
		this.name="";
		this.sumCredit = 0.0f;
		this.creditPass = 0.0f;
		this.creditFail = 0.0f;
		this.gradpoint = 0.0f;
		this.major="";
	}
	public GradeInfo(String studentID,String name,float sumCredit, float creditPass, float creditFail, float gradpoint,String major) {
		super();
		this.studentID=studentID;
		this.name=name;
		this.sumCredit = sumCredit;
		this.creditPass = creditPass;
		this.creditFail = creditFail;
		this.gradpoint = gradpoint;
		this.major=major;
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public int compareTo(Object o) {
		GradeInfo sdto = (GradeInfo)o;
	       float otherScore = sdto.getGradpoint();
	       if(this.getGradpoint()>otherScore)
	    	   return -1;
	       else if(this.getGradpoint()<otherScore)
	    	   return 1;
	       else return 0;
	}
	
}
