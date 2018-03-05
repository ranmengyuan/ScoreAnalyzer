package bean;

public class StudentInfo implements Comparable{
	private String studentID;//学号
	private String name;//姓名
	private String course;//课程名
	private float credit;//学分
	private String scoreSum;//总评成绩
	private int remark;//备注
	private float scoreCal;//折算成绩 
	private float gradPoint;//绩点
	private int courseNature;//课程性质
	private int courseAscription;//课程归属
	private int repair;//重修标记
	private String courseNo;//课程编号
	private int startYear;//学期开始年份
	private int term;//学期
	private String college;//学院
	private String major;//专业
	private String className;//班级
	
	public StudentInfo()
	{
		super();
		this.studentID = "-1";
		this.name = "-1";
		this.course = "-1";
		this.credit = -1;
		this.scoreSum = "-1";
		this.remark = -1;
		this.scoreCal = -1;
		this.gradPoint = -1;
		this.courseNature = -1;
		this.courseAscription = -1;
		this.repair=-1;
		this.courseNo = "-1";
		this.startYear = 1;
		this.term = 1;
		this.college = "-1";
		this.major = "-1";
		this.className = "-1";
	}
	public StudentInfo(String studentID, String name, String course, float credit, String scoreSum, int remark,
			float scoreCal, float gradPoint, int courseNature, int courseAscription,int repair, String courseNo, int startYear,
			int term, String college, String major, String className) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.course = course;
		this.credit = credit;
		this.scoreSum = scoreSum;
		this.remark = remark;
		this.scoreCal = scoreCal;
		this.gradPoint = gradPoint;
		this.courseNature = courseNature;
		this.courseAscription = courseAscription;
		this.courseNo = courseNo;
		this.startYear = startYear;
		this.term = term;
		this.college = college;
		this.major = major;
		this.className = className;
		this.repair=repair;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public String getScoreSum() {
		return scoreSum;
	}
	public void setScoreSum(String scoreSum) {
		this.scoreSum = scoreSum;
	}
	public int getRemark() {
		return remark;
	}
	public void setRemark(int remark) {
		this.remark = remark;
	}
	public float getScoreCal() {
		return scoreCal;
	}
	public void setScoreCal(float scoreCal) {
		this.scoreCal = scoreCal;
	}
	public float getGradPoint() {
		return gradPoint;
	}
	public void setGradPoint(float gradPoint) {
		this.gradPoint = gradPoint;
	}
	public int getCourseNature() {
		return courseNature;
	}
	public void setCourseNature(int courseNature) {
		this.courseNature = courseNature;
	}
	public int getCourseAscription() {
		return courseAscription;
	}
	public void setCourseAscription(int courseAscription) {
		this.courseAscription = courseAscription;
	}
	
	public int getRepair() {
		return repair;
	}
	public void setRepair(int repair) {
		this.repair = repair;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public int compareTo(Object o) {
		StudentInfo sdto = (StudentInfo)o;
	       float otherScore = sdto.getScoreCal();
	       if(this.getScoreCal()>otherScore)
	    	   return -1;
	       else if(this.getScoreCal()<otherScore)
	    	   return 1;
	       else return 0;
	}
}


