package helper;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	connectionPool cp;
	Connection conn = null;
	/**
	 * 建立连接
	 * @param cp
	 */
	public CreateTable(connectionPool cp) {
		
		this.cp = cp;
		try {
			this.conn=cp.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 初始化所有表格
 */
	public void InitalTable() {
		try {
//			dropStuentInfo12Table();
//			dropStuentInfo13Table();
//			dropStudentInfo14Table();
//			dropStudentInfo1531Table();
//			dropStudentInfo1536Table();
//			dropStudentInfo1537Table();
//			dropStudentInfo1538Table();
//			dropStudentInfo1539Table();
//			createStudentInfo12Table();
//			createStudentInfo13Table();
//			createStudentInfo14Table();
//			createStudentInfo1531Table();
//			createStudentInfo1536Table();
//			createStudentInfo1537Table();
//			createStudentInfo1538Table();
//			createStudentInfo1539Table();
//			dropStudentInfoTable("StudentInfo1231");
//			createStudentInfoTable("StudentInfo1231");
//			dropStudentInfoTable("StudentInfo1236");
//			createStudentInfoTable("StudentInfo1236");
//			dropStudentInfoTable("StudentInfo1237");
//			createStudentInfoTable("StudentInfo1237");
//			dropStudentInfoTable("StudentInfo1237A");
//			createStudentInfoTable("StudentInfo1237A");
//			dropStudentInfoTable("StudentInfo1238");
//			createStudentInfoTable("StudentInfo1238");
//			dropStudentInfoTable("StudentInfo1239");
//			createStudentInfoTable("StudentInfo1239");
//			
//			dropStudentInfoTable("StudentInfo1331");
//			createStudentInfoTable("StudentInfo1331");
//			dropStudentInfoTable("StudentInfo1336");
//			createStudentInfoTable("StudentInfo1336");
//			dropStudentInfoTable("StudentInfo1337");
//			createStudentInfoTable("StudentInfo1337");
//			dropStudentInfoTable("StudentInfo1337A");
//			createStudentInfoTable("StudentInfo1337A");
//			dropStudentInfoTable("StudentInfo1338");
//			createStudentInfoTable("StudentInfo1338");
//			dropStudentInfoTable("StudentInfo1339");
//			createStudentInfoTable("StudentInfo1339");
//			
//			dropStudentInfoTable("StudentInfo1431");
//			createStudentInfoTable("StudentInfo1431");
//			dropStudentInfoTable("StudentInfo1436");
//			createStudentInfoTable("StudentInfo1436");
//			dropStudentInfoTable("StudentInfo1437");
//			createStudentInfoTable("StudentInfo1437");
//			dropStudentInfoTable("StudentInfo1437A");
//			createStudentInfoTable("StudentInfo1437A");
//			dropStudentInfoTable("StudentInfo1438");
//			createStudentInfoTable("StudentInfo1438");
//			dropStudentInfoTable("StudentInfo1439");
//			createStudentInfoTable("StudentInfo1439");
//			dropStudentInfoTable("StudentInfo15");
//			createStudentInfoTable("StudentInfo15");
			
//			dropCourseTable("Course");
//			createCourseTable("Course");
//			dropCourseTable("CourseMajor");
//			createCourseMajorTable("CourseMajor");
			
//			dropCourseTable("CourseStudent12");
//			createCourseStudentTable("CourseStudent12");
//			dropCourseTable("CourseStudent13");
//			createCourseStudentTable("CourseStudent13");
//			dropCourseTable("CourseStudent14");
//			createCourseStudentTable("CourseStudent14");
//			dropCourseTable("CourseStudent15");
//			createCourseStudentTable("CourseStudent15");
			
//			dropCourseTable("CourseGrade");
//			createCourseGradeTable("CourseGrade");
//			dropCourseTable("CourseGradeMajor");
//			createCourseGradeMajorTable("CourseGradeMajor");
			
//			dropCourseTable("Grade");
//			createGradeTable("Grade");
//			dropCourseTable("GradeFirst");
//			createGradeTable("GradeFirst");
//			dropCourseTable("AllGrade");
//			createAllGradeTable("AllGrade");
//			dropCourseTable("AllGradeFirst");
//			createAllGradeTable("AllGradeFirst");
//			dropCourseTable("AllMajor");
//			createAllMajorTable("AllMajor");
//			dropCourseTable("Major");
//			createGradeTable("Major");
//			dropCourseTable("AllClass");
//			createAllClassTable("AllClass");
			
//			dropCourseTable("ClassCon");
//			createClassTable("ClassCon");
			dropCourseTable("Fail");
			createFailTable("Fail");
//			dropCourseTable("FailCourse");
//			createFailCourseTable("FailCourse");
			
			
			freePool();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	/**
	 * 刷新缓存表格
	 */
	public void InitalTable1() {
		try {
			dropCourseTable("temp");
			createStudentInfoTable("temp");
			freePool();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	/**
	 * 删除StudentInfo12表格
	 */
		public void dropStuentInfo12Table() {
		
			Statement stmt = null;

			String sql = " drop table if exists StudentInfo12";
			try {
				stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				stmt.execute(sql);
				System.out.println("drop StudentInfo12 table sucess!");
			} catch (Exception ex) {
				System.out.println(ex);
				System.out.println("drop StudentInfo12 table failed!");
			} finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cp.returnConnection(conn);
			}
		}
/**
 * 删除StudentInfo13表格
 */
	public void dropStuentInfo13Table() {
	
		Statement stmt = null;

		String sql = " drop table if exists StudentInfo13";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo13 table sucess!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo13 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
/**
 * 删除StudentInfo14表格
 */
	public void dropStudentInfo14Table() {

		Statement stmt = null;

		String sql = " drop table if exists StudentInfo14";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo14 table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo14 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	/**
	 * 删除StudentInfo1531表格
	 */
	public void dropStudentInfo1531Table() {

		Statement stmt = null;

		String sql = " drop table if exists StudentInfo1531";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo1531 table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo1531 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	/**
	 * 删除StudentInfo1536表格
	 */
	public void dropStudentInfo1536Table() {

		Statement stmt = null;

		String sql = " drop table if exists StudentInfo1536";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo1536 table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo1536 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	/**
	 * 删除StudentInfo1531表格
	 */
	public void dropStudentInfo1537Table() {

		Statement stmt = null;

		String sql = " drop table if exists StudentInfo1537";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo1537 table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo1537 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	/**
	 * 删除StudentInfo1538表格
	 */
	public void dropStudentInfo1538Table() {

		Statement stmt = null;

		String sql = " drop table if exists StudentInfo1538";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo1538 table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo1538 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	/**
	 * 删除StudentInfo1539表格
	 */
	public void dropStudentInfo1539Table() {

		Statement stmt = null;

		String sql = " drop table if exists StudentInfo1539";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop StudentInfo1539 table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop StudentInfo1539 table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	/**
	 * 删除表格
	 */
	public void dropStudentInfoTable(String formname) {

		Statement stmt = null;

		String sql = " drop table if exists "+formname+"";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop "+formname+" table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop "+formname+" table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 删除表格
	 */
	public void dropCourseTable(String formname) {

		Statement stmt = null;

		String sql = " drop table if exists "+formname+"";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			System.out.println("drop "+formname+" table success");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("drop "+formname+" table failed!");
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cp.returnConnection(conn);
		}
	}
			

	/**
	 * 创建StudentInfo12表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo12Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo12 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo12 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo12 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}	
	/**
	 * 创建StudentInfo13表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo13Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo13 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo13 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo13 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}	
	
	/**
	 * 创建StudentInfo14表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo14Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo14 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo14 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo14 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}	
	/**
	 * 创建StudentInfo1531表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo1531Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo1531 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo1531 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo1531 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	/**
	 * 创建StudentInfo1536表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo1536Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo1536 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo1536 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo1536 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	/**
	 * 创建StudentInfo1537表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo1537Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo1537 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo1537 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo1537 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}	
	/**
	 * 创建StudentInfo1538表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo1538Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo1538 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo1538 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo1538 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}	
	/**
	 * 创建StudentInfo1539表格，并设置属性
	 * @param args
	 */

	public void createStudentInfo1539Table() throws SQLException {
		Statement stmt = null;
		String sql = "create table StudentInfo1539 ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create StudentInfo1539 table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create StudentInfo1539 table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}	
	/**
	 * 创建表格，并设置属性
	 * @param args
	 */

	public void createStudentInfoTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), " +"name varchar(255), " +"course varchar(255), " +"credit float, " +"scoreSum varchar(255), " +"remark int, " +"scoreCal float, " +"gradPoint float, " +"courseNature int, " +"courseAscription int, " +"repair int, " +"courseNo varchar(255), " +"startYear int, " +"term int, " +
				"college varchar(255),"+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建课程表格，并设置属性
	 * @param args
	 */

	public void createCourseTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"course varchar(255), " +"grade varchar(255), "  
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建课程表格，并设置属性
	 * @param args
	 */

	public void createCourseMajorTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"course varchar(255), " +"major varchar(255), "+"grade varchar(255), "   
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建学生课程信息表格，并设置属性
	 * @param args
	 */

	public void createCourseStudentTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"course varchar(255), " +"studentID varchar(255), " +"name varchar(255), "+"major varchar(255), " +"startYear int, " +"term int, "+"scoreSum varchar(255), "+"credit float, "+"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	
	/**
	 * 创建课程成绩信息表格，并设置属性
	 * @param args
	 */

	public void createCourseGradeTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"course varchar(255), " +"sum int, " +"sumFail int, "+"passRate float, " +"startYear int, "+"term int, "+"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建课程成绩信息表格，并设置属性
	 * @param args
	 */

	public void createCourseGradeMajorTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"course varchar(255), " +"sum int, " +"sumFail int, "+"passRate float, " +"startYear int, "+"term int, "+"major varchar(255), "+"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	/**
	 * 创建年级成绩信息表格，并设置属性
	 * @param args
	 */

	public void createGradeTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), "+"name varchar(255), " +"creditPass float, " +"creditFail float, "+"sumCredit float, " +"gradpoint float, "+"rank int, "+"grade varchar(255), "+"major varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	/**
	 * 创建年级总体信息表格，并设置属性
	 * @param args
	 */

	public void createAllGradeTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"sumPass int, "+"sumFail int, " +"sum int, " +"sumNum int, "+"passRate float, " +"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	/**
	 * 创建专业总体信息表格，并设置属性
	 * @param args
	 */

	public void createAllMajorTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"sumPass int, "+"sumFail int, " +"sum int, " +"sumNum int, "+"passRate float, " +"major varchar(255), "+"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建专业总体信息表格，并设置属性
	 * @param args
	 */

	public void createAllClassTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"sumPass int, "+"sumFail int, " +"sum int, " +"sumNum int, "+"passRate float, " +"major varchar(255), "+"className varchar(255), "+"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建班级成绩信息表格，并设置属性
	 * @param args
	 */

	public void createClassTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), "+"name varchar(255), " +"creditPass float, " +"creditFail float, "+"sumCredit float, " +"gradpoint float, "+"rank int, "+"grade varchar(255), "+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建挂科学生信息表格，并设置属性
	 * @param args
	 */

	public void createFailTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), "+"name varchar(255), " +"creditPass0 float, " +"creditFail0 float, "+"sumCredit0 float, " +"gradpoint0 float, "+"failSum0 int, "+"creditPass1 float, " +"creditFail1 float, "+"sumCredit1 float, " +"gradpoint1 float, "+"failSum1 int, "+"creditPass2 float, " +"creditFail2 float, "+"sumCredit2 float, " +"gradpoint2 float, "+"failSum2 int, "+"creditPass3 float, " +"creditFail3 float, "+"sumCredit3 float, " +"gradpoint3 float, "+"failSum3 int, "+"creditPass4 float, " +"creditFail4 float, "+"sumCredit4 float, " +"gradpoint4 float, "+"failSum4 int, "+"creditPass5 float, " +"creditFail5 float, "+"sumCredit5 float, " +"gradpoint5 float, "+"failSum5 int, "+"creditPass6 float, " +"creditFail6 float, "+"sumCredit6 float, " +"gradpoint6 float, "+"failSum6 int, "+"creditPass7 float, " +"creditFail7 float, "+"sumCredit7 float, " +"gradpoint7 float, "+"failSum7 int, "+"creditPass8 float, " +"creditFail8 float, "+"sumCredit8 float, " +"gradpoint8 float, "+"failSum8 int, "+"creditPass9 float, " +"creditFail9 float, "+"sumCredit9 float, " +"gradpoint9 float, "+"failSum9 int, "+"grade varchar(255), "+"major varchar(255), "+"className varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 创建挂科学生信息表格，并设置属性
	 * @param args
	 */

	public void createFailCourseTable(String formname) throws SQLException {
		Statement stmt = null;
		String sql = "create table "+formname+" ("
				+ "ID int NOT NULL AUTO_INCREMENT, "
				+"studentID varchar(255), "+"name varchar(255), " +"course varchar(255), " +"startYear int, "+"term int, " +"courseNature int, "+"repair int, "+"grade varchar(255), "
				+ "primary key(ID))"
				+ "ENGINE=InnoDB DEFAULT CHARSET=UTF8";
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.execute(sql);
			stmt.close();
			System.out.println("create "+formname+" table success!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("create "+formname+" table failed!");
		} finally {			
			cp.returnConnection(conn);
		}
	}
	
	/**
	 * 释放连接池
	 */
	public void freePool() {
		try {
			cp.closeConnectionPool();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

