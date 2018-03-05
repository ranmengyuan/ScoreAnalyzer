package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.StudentInfo;
import helper.connectionPool;

/**
 * 建立连接
 * @author ranmengyuan
 *
 */
public class StudentInfoDAO {
	connectionPool cp;
	Connection conn;
	public StudentInfoDAO(connectionPool cp){
		this.cp=cp;
		try {
			this.conn=cp.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 将数据插入StudentInfo12表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo12(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo12(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo13表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo13(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo13(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo14表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo14(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo14(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo1531表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo1531(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo1531(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo1536表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo1536(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo1536(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo1537表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo1537(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo1537(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo1538表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo1538(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo1538(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入StudentInfo1539表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo1539(StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into StudentInfo1539(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertStudentInfo(String formname,StudentInfo info) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(studentID,name,course,credit,scoreSum,remark,scoreCal,gradPoint,courseNature,courseAscription,repair,courseNo,startYear,term,college,major,className)VALUES('"+info.getStudentID()+"','"+info.getName()+"','"+info.getCourse()+"','"+info.getCredit()+"','"+info.getScoreSum()+"','"+info.getRemark()+"','"+info.getScoreCal()+"','"+info.getGradPoint()+"','"+info.getCourseNature()+"','"+info.getCourseAscription()+"','"+info.getRepair()+"','"+info.getCourseNo()+"','"+info.getStartYear()+"','"+info.getTerm()+"','"+info.getCollege()+"','"+info.getMajor()+"','"+info.getClassName()+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(info.getStudentID()+"\t"+info.getName()+"\t"+info.getCourse()+"\t"+info.getCredit()+"\t"+info.getScoreSum()+"\t"+info.getRemark()+"\t"+info.getScoreCal()+"\t"+info.getGradPoint()+"\t"+info.getCourseNature()+"\t"+info.getCourseAscription()+"\t"+info.getRepair()+"\t"+info.getCourseNo()+"\t"+info.getStartYear()+"\t"+info.getTerm()+"\t"+info.getCollege()+"\t"+info.getMajor()+"\t"+info.getClassName());
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertCourse(String formname,String course,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(course,grade)VALUES('"+course+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(course+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertCourseMajor(String formname,String course,String major,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(course,major,grade)VALUES('"+course+"','"+major+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(course+"\t"+major+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertCourseStudent(String formname,String course,String studentID,String name,String major,int startYear,int term,String scoreSum,float credit,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(course,studentID,name,major,startYear,term,scoreSum,credit,grade)VALUES('"+course+"','"+studentID+"','"+name+"','"+major+"','"+startYear+"','"+term+"','"+scoreSum+"','"+credit+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(course+"\t"+studentID+"\t"+name+"\t"+major+"\t"+startYear+"\t"+scoreSum+"\t"+credit+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将课程成绩数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertCourseGrade(String formname,String course,int sum,int sumFail,float passRate,int startYear,int term,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(course,sum,sumFail,passRate,startYear,term,grade)VALUES('"+course+"','"+sum+"','"+sumFail+"','"+passRate+"','"+startYear+"','"+term+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(course+"\t"+sum+"\t"+sumFail+"\t"+passRate+"\t"+startYear+"\t"+term+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将课程成绩数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertCourseGradeMajor(String formname,String course,int sum,int sumFail,float passRate,int startYear,int term,String major,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(course,sum,sumFail,passRate,startYear,term,major,grade)VALUES('"+course+"','"+sum+"','"+sumFail+"','"+passRate+"','"+startYear+"','"+term+"','"+major+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(course+"\t"+sum+"\t"+sumFail+"\t"+passRate+"\t"+startYear+"\t"+term+"\t"+major+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	
	/**
	 * 将年级排名数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertGrade(String formname,String studentID,String name,float creditPass,float creditFail,float sumCredit,float gradpoint,int rank,String grade,String major) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(studentID,name,creditPass,creditFail,sumCredit,gradpoint,rank,grade,major)VALUES('"+studentID+"','"+name+"','"+creditPass+"','"+creditFail+"','"+sumCredit+"','"+gradpoint+"','"+rank+"','"+grade+"','"+major+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(studentID+"\t"+name+"\t"+creditPass+"\t"+creditFail+"\t"+sumCredit+"\t"+gradpoint+"\t"+rank+"\t"+grade+"\t"+major);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将年级总体数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertAllGrade(String formname,int sumPass,int sumFail,int sum,int sumNum,float passRate,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(sumPass,sumFail,sum,sumNum,passRate,grade)VALUES('"+sumPass+"','"+sumFail+"','"+sum+"','"+sumNum+"','"+passRate+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(sumPass+"\t"+sumFail+"\t"+sum+"\t"+sumNum+"\t"+passRate+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将年级总体数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertAllMajor(String formname,int sumPass,int sumFail,int sum,int sumNum,float passRate,String major,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(sumPass,sumFail,sum,sumNum,passRate,major,grade)VALUES('"+sumPass+"','"+sumFail+"','"+sum+"','"+sumNum+"','"+passRate+"','"+major+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(sumPass+"\t"+sumFail+"\t"+sum+"\t"+sumNum+"\t"+passRate+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将班级总体数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertAllClass(String formname,int sumPass,int sumFail,int sum,int sumNum,float passRate,String major,String className,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(sumPass,sumFail,sum,sumNum,passRate,major,className,grade)VALUES('"+sumPass+"','"+sumFail+"','"+sum+"','"+sumNum+"','"+passRate+"','"+major+"','"+className+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(sumPass+"\t"+sumFail+"\t"+sum+"\t"+sumNum+"\t"+passRate+"\t"+major+"\t"+className+"\t"+grade);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将班级排名数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertClass(String formname,String studentID,String name,float creditPass,float creditFail,float sumCredit,float gradpoint,int rank,String grade,String major,String className) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(studentID,name,creditPass,creditFail,sumCredit,gradpoint,rank,grade,major,className)VALUES('"+studentID+"','"+name+"','"+creditPass+"','"+creditFail+"','"+sumCredit+"','"+gradpoint+"','"+rank+"','"+grade+"','"+major+"','"+className+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(studentID+"\t"+name+"\t"+creditPass+"\t"+creditFail+"\t"+sumCredit+"\t"+gradpoint+"\t"+rank+"\t"+grade+"\t"+major);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 将挂科排名数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertFail(String formname,String studentID,String name,float creditPass0,float creditFail0,float sumCredit0,float gradpoint0,int failSum0,float creditPass1,float creditFail1,float sumCredit1,float gradpoint1,int failSum1,float creditPass2,float creditFail2,float sumCredit2,float gradpoint2,int failSum2,float creditPass3,float creditFail3,float sumCredit3,float gradpoint3,int failSum3,float creditPass4,float creditFail4,float sumCredit4,float gradpoint4,int failSum4,float creditPass5,float creditFail5,float sumCredit5,float gradpoint5,int failSum5,float creditPass6,float creditFail6,float sumCredit6,float gradpoint6,int failSum6,float creditPass7,float creditFail7,float sumCredit7,float gradpoint7,int failSum7,float creditPass8,float creditFail8,float sumCredit8,float gradpoint8,int failSum8,float creditPass9,float creditFail9,float sumCredit9,float gradpoint9,int failSum9,String grade,String major,String className) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(studentID,name,creditPass0,creditFail0,sumCredit0,gradpoint0,failSum0,creditPass1,creditFail1,sumCredit1,gradpoint1,failSum1,creditPass2,creditFail2,sumCredit2,gradpoint2,failSum2,creditPass3,creditFail3,sumCredit3,gradpoint3,failSum3,creditPass4,creditFail4,sumCredit4,gradpoint4,failSum4,creditPass5,creditFail5,sumCredit5,gradpoint5,failSum5,creditPass6,creditFail6,sumCredit6,gradpoint6,failSum6,creditPass7,creditFail7,sumCredit7,gradpoint7,failSum7,creditPass8,creditFail8,sumCredit8,gradpoint8,failSum8,creditPass9,creditFail9,sumCredit9,gradpoint9,failSum9,grade,major,className)VALUES('"+studentID+"','"+name+"','"+creditPass0+"','"+creditFail0+"','"+sumCredit0+"','"+gradpoint0+"','"+failSum0+"','"+creditPass1+"','"+creditFail1+"','"+sumCredit1+"','"+gradpoint1+"','"+failSum1+"','"+creditPass2+"','"+creditFail2+"','"+sumCredit2+"','"+gradpoint2+"','"+failSum2+"','"+creditPass3+"','"+creditFail3+"','"+sumCredit3+"','"+gradpoint3+"','"+failSum3+"','"+creditPass4+"','"+creditFail4+"','"+sumCredit4+"','"+gradpoint4+"','"+failSum4+"','"+creditPass5+"','"+creditFail5+"','"+sumCredit5+"','"+gradpoint5+"','"+failSum5+"','"+creditPass6+"','"+creditFail6+"','"+sumCredit6+"','"+gradpoint6+"','"+failSum6+"','"+creditPass7+"','"+creditFail7+"','"+sumCredit7+"','"+gradpoint7+"','"+failSum7+"','"+creditPass8+"','"+creditFail8+"','"+sumCredit8+"','"+gradpoint8+"','"+failSum8+"','"+creditPass9+"','"+creditFail9+"','"+sumCredit9+"','"+gradpoint9+"','"+failSum9+"','"+grade+"','"+major+"','"+className+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(studentID+"\t"+name+"\t"+creditPass9+"\t"+creditFail9+"\t"+sumCredit9+"\t"+gradpoint9+"\t"+failSum9+"\t"+grade+"\t"+major);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	/**
	 * 将挂科科目数据插入表格中
	 * @param info
	 * @throws SQLException
	 */
	public void insertFailCourse(String formname,String studentID,String name,String course,int startYear,int term,int courseNature,int repair,String grade) throws SQLException {
		PreparedStatement stmt=null;
		
		String sql = "insert into "+formname+"(studentID,name,course,startYear,term,courseNature,repair,grade)VALUES('"+studentID+"','"+name+"','"+course+"','"+startYear+"','"+term+"','"+courseNature+"','"+repair+"','"+grade+"')";           
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println(studentID+"\t"+name+"\t"+course+"\t"+startYear+"\t"+term);
		}finally {			
			cp.returnConnection(conn);			
		}

	}
	
	/**
	 * 获得每个专业的学生信息
	 * @param formname
	 * @param major
	 * @return
	 */
	public ArrayList<StudentInfo> getStudentMajor(String formname,String major){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		String sql ="select* from "+formname+" where major='"+major+"'";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 StudentInfo temp=new StudentInfo();
	               temp.setStudentID(ret.getString(2));
	               temp.setName(ret.getString(3));
	               temp.setCourse(ret.getString(4));
	               temp.setCredit(ret.getFloat(5));
	               temp.setScoreSum(ret.getString(6));
	               temp.setRemark(ret.getInt(7));
	               temp.setScoreCal(ret.getInt(8));
	               temp.setGradPoint(ret.getFloat(9));
	               temp.setCourseNature(ret.getInt(10));
	               temp.setCourseAscription(ret.getInt(11));
	               temp.setRepair(ret.getInt(12));
	               temp.setCourseNo(ret.getString(13));
	               temp.setStartYear(ret.getInt(14));
	               temp.setTerm(ret.getInt(15));
	               temp.setCollege(ret.getString(16));
	               temp.setMajor(ret.getString(17));
	               temp.setClassName(ret.getString(18));
	               data.add(temp);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return data;
	}
	/**
	 * 获得每个课程的学生信息
	 * @param formname
	 * @param major
	 * @return
	 */
	public ArrayList<StudentInfo> getStudentCourse(String formname,String course){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		String sql ="select* from "+formname+" where course='"+course+"'";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 StudentInfo temp=new StudentInfo();
	               temp.setStudentID(ret.getString(2));
	               temp.setName(ret.getString(3));
	               temp.setCourse(ret.getString(4));
	               temp.setCredit(ret.getFloat(5));
	               temp.setScoreSum(ret.getString(6));
	               temp.setRemark(ret.getInt(7));
	               temp.setScoreCal(ret.getInt(8));
	               temp.setGradPoint(ret.getFloat(9));
	               temp.setCourseNature(ret.getInt(10));
	               temp.setCourseAscription(ret.getInt(11));
	               temp.setRepair(ret.getInt(12));
	               temp.setCourseNo(ret.getString(13));
	               temp.setStartYear(ret.getInt(14));
	               temp.setTerm(ret.getInt(15));
	               temp.setCollege(ret.getString(16));
	               temp.setMajor(ret.getString(17));
	               temp.setClassName(ret.getString(18));
	               data.add(temp);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return data;
	}
	
	/**
	 * 获得每个专业和课程的学生信息
	 * @param formname
	 * @param major
	 * @return
	 */
	public ArrayList<StudentInfo> getStudentCourseMajor(String formname,String course,String major){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		String sql ="select* from "+formname+" where course='"+course+"'and major='"+major+"'";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 StudentInfo temp=new StudentInfo();
	               temp.setStudentID(ret.getString(2));
	               temp.setName(ret.getString(3));
	               temp.setCourse(ret.getString(4));
	               temp.setCredit(ret.getFloat(5));
	               temp.setScoreSum(ret.getString(6));
	               temp.setRemark(ret.getInt(7));
	               temp.setScoreCal(ret.getInt(8));
	               temp.setGradPoint(ret.getFloat(9));
	               temp.setCourseNature(ret.getInt(10));
	               temp.setCourseAscription(ret.getInt(11));
	               temp.setRepair(ret.getInt(12));
	               temp.setCourseNo(ret.getString(13));
	               temp.setStartYear(ret.getInt(14));
	               temp.setTerm(ret.getInt(15));
	               temp.setCollege(ret.getString(16));
	               temp.setMajor(ret.getString(17));
	               temp.setClassName(ret.getString(18));
	               data.add(temp);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return data;
	}
	
	/**
	 * 获得一个表的所有信息
	 * @param formname
	 * @param major
	 * @return
	 */
	public ArrayList<StudentInfo> getInfo(String formname){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		String sql ="select* from "+formname+" where 1=1";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 StudentInfo temp=new StudentInfo();
	               temp.setStudentID(ret.getString(2));
	               temp.setName(ret.getString(3));
	               temp.setCourse(ret.getString(4));
	               temp.setCredit(ret.getFloat(5));
	               temp.setScoreSum(ret.getString(6));
	               temp.setRemark(ret.getInt(7));
	               temp.setScoreCal(ret.getInt(8));
	               temp.setGradPoint(ret.getFloat(9));
	               temp.setCourseNature(ret.getInt(10));
	               temp.setCourseAscription(ret.getInt(11));
	               temp.setRepair(ret.getInt(12));
	               temp.setCourseNo(ret.getString(13));
	               temp.setStartYear(ret.getInt(14));
	               temp.setTerm(ret.getInt(15));
	               temp.setCollege(ret.getString(16));
	               temp.setMajor(ret.getString(17));
	               temp.setClassName(ret.getString(18));
	               data.add(temp);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return data;
	}
	
	
	
	/**
	 * 获取每个表的所有课程
	 * @param game
	 * @return
	 */
	public ArrayList<String> getCourse(String formname){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<String> course=new ArrayList<String>();
		String sql ="select course from "+formname+" group by course";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) {         
	               course.add(ret.getString(1));        
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return course;
	}
	
	/**
	 * 获取一个专业的所有课程
	 * @param game
	 * @return
	 */
	public ArrayList<String> getCourseMajor(String formname,String major){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<String> course=new ArrayList<String>();
		String sql ="select course from "+formname+" where major='"+major+"' group by course";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) {         
	               course.add(ret.getString(1));        
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return course;
	}
	
	/**
	 * 获得每个学生的姓名
	 * @param formname
	 * @return
	 */
	public ArrayList<String>getNo(String formname){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<String> name=new ArrayList<String>();
		String sql ="select studentID from "+formname+" group by studentID";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) {         
	               name.add(ret.getString(1));        
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return name;
	}
	/**
	 * 获得所有班级
	 * @param formname
	 * @return
	 */
	public ArrayList<String>getClass(String formname){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<String> name=new ArrayList<String>();
		String sql ="select className from "+formname+" group by className";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) {         
	               name.add(ret.getString(1));        
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return name;
	}
	
	
	
	
	
	/**
	 * 获得学生的信息
	 * @param formname
	 * @param major
	 * @return
	 */
	public ArrayList<StudentInfo> getInfoByNo(String formname,String no){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		String sql ="select* from "+formname+" where studentID='"+no+"'and (course,scoreCal) in(select course,scoreCal from "+formname+" where studentID='"+no+"' and scoreCal in(select MAX(scoreCal) from "+formname+" where studentID='"+no+"' group by course) group by course)";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 StudentInfo temp=new StudentInfo();
	               temp.setStudentID(ret.getString(2));
	               temp.setName(ret.getString(3));
	               temp.setCourse(ret.getString(4));
	               temp.setCredit(ret.getFloat(5));
	               temp.setScoreSum(ret.getString(6));
	               temp.setRemark(ret.getInt(7));
	               temp.setScoreCal(ret.getInt(8));
	               temp.setGradPoint(ret.getFloat(9));
	               temp.setCourseNature(ret.getInt(10));
	               temp.setCourseAscription(ret.getInt(11));
	               temp.setRepair(ret.getInt(12));
	               temp.setCourseNo(ret.getString(13));
	               temp.setStartYear(ret.getInt(14));
	               temp.setTerm(ret.getInt(15));
	               temp.setCollege(ret.getString(16));
	               temp.setMajor(ret.getString(17));
	               temp.setClassName(ret.getString(18));
	               data.add(temp);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return data;
	}
	
	
	/**
	 * 获得班级名单
	 * @param formname
	 * @param major
	 * @return
	 */
	public ArrayList<StudentInfo> getInfoByClass(String formname,String no){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		String sql ="select* from "+formname+" where className='"+no+"'";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 StudentInfo temp=new StudentInfo();
	               temp.setStudentID(ret.getString(2));
	               temp.setName(ret.getString(3));
	               temp.setCourse(ret.getString(4));
	               temp.setCredit(ret.getFloat(5));
	               temp.setScoreSum(ret.getString(6));
	               temp.setRemark(ret.getInt(7));
	               temp.setScoreCal(ret.getInt(8));
	               temp.setGradPoint(ret.getFloat(9));
	               temp.setCourseNature(ret.getInt(10));
	               temp.setCourseAscription(ret.getInt(11));
	               temp.setRepair(ret.getInt(12));
	               temp.setCourseNo(ret.getString(13));
	               temp.setStartYear(ret.getInt(14));
	               temp.setTerm(ret.getInt(15));
	               temp.setCollege(ret.getString(16));
	               temp.setMajor(ret.getString(17));
	               temp.setClassName(ret.getString(18));
	               data.add(temp);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}		
		return data;
	}
	
	
	
	
	/**
	 * 获得培养计划
	 * @param formname
	 * @param major
	 * @return
	 */
	public String getNobyClasscon(String formname,String major,String grade){
		ResultSet ret = null;
		PreparedStatement stmt=null;
		float credit=0.0f;
		String sql ="select sumCredit from "+formname+" where major='"+major+"' and grade='"+grade+"'group by sumCredit order by COUNT(sumCredit) ";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) { 
				 credit=ret.getFloat(1);
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		ArrayList<String> no=new ArrayList<>();
		ArrayList<Float> cre=new ArrayList<>();
		String studentID=null;
		sql="select studentID,sumCredit from "+formname+" where major='"+major+"' and grade='"+grade+"' order by creditFail ";
		try {
			stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			ret=stmt.executeQuery();
			 while (ret.next()) {
				 no.add(ret.getString(1));
				 cre.add(ret.getFloat(2));
	            }          
			ret.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		for(int i=0;i<no.size();i++){
			if(credit==cre.get(i)){
				studentID=no.get(i);
				break;
			}
		}
		return studentID;
	}

}


