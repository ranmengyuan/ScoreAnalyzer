package operation;

import java.awt.GradientPaint;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import bean.GradeInfo;
import bean.StudentFail;
import bean.StudentInfo;
import bean.YearTerm;
import dao.StudentInfoDAO;
import helper.CreateTable;
import helper.connectionPool;

public class toDatabase {
	public static void main(String[] args) throws Exception{
		toDatabase deal=new toDatabase();
//		deal.toDatabaseFromFile();
//		deal.getData();
//		deal.getDatabyCourse();
//		deal.getDatabyName();
//		deal.getDatabyMajor();
//		deal.getDatabyClass();
		deal.getFail();
//		deal.getPlane();
//		deal.getDatabyCourseMajor();
		
	}
	/**
	 * 获取各年级各专业的信息
	 * @throws SQLException
	 */
	public void getData() throws SQLException{
		connectionPool cp=new connectionPool();
		CreateTable table=new CreateTable(cp);
		table.InitalTable();
		connectionPool cp1=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp1);
		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
		
		String []formName={"StudentInfo12","StudentInfo13","StudentInfo14"};
		String []formname31={"StudentInfo1231","StudentInfo1331","StudentInfo1431"};
		String []formname36={"StudentInfo1236","StudentInfo1336","StudentInfo1436"};
		String []formname37={"StudentInfo1237","StudentInfo1337","StudentInfo1437"};
		String []formname37A={"StudentInfo1237A","StudentInfo1337A","StudentInfo1437A"};
		String []formname38={"StudentInfo1238","StudentInfo1338","StudentInfo1438"};
		String []formname39={"StudentInfo1239","StudentInfo1339","StudentInfo1439"};
		
		for(int index=0;index<3;index++){
			data=oper.getStudentMajor(formName[index], "物联网工程");
			for(int i=0;i<data.size();i++)
				oper.insertStudentInfo(formname31[index], data.get(i));
			data=oper.getStudentMajor(formName[index], "信息管理与信息系统");
			for(int i=0;i<data.size();i++)
				oper.insertStudentInfo(formname36[index], data.get(i));
			data=oper.getStudentMajor(formName[index], "计算机科学与技术");
			for(int i=0;i<data.size();i++)
				oper.insertStudentInfo(formname37[index], data.get(i));
			data=oper.getStudentMajor(formName[index], "计算机科学与技术(卓越工程师)");
			for(int i=0;i<data.size();i++)
				oper.insertStudentInfo(formname37A[index], data.get(i));
			data=oper.getStudentMajor(formName[index], "软件工程");
			for(int i=0;i<data.size();i++)
				oper.insertStudentInfo(formname38[index], data.get(i));
			data=oper.getStudentMajor(formName[index], "网络工程");
			for(int i=0;i<data.size();i++)
				oper.insertStudentInfo(formname39[index], data.get(i));
		}
	}
	
	/**
	 * 获取一门课的所有信息
	 * @throws SQLException 
	 */
	public void getDatabyCourse() throws SQLException{
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		connectionPool cp1=new connectionPool();
		CreateTable in=new CreateTable(cp1);
		in.InitalTable();
		String []formname={"StudentInfo12","StudentInfo13","StudentInfo14","StudentInfo15"};
		ArrayList<String> data=new ArrayList<String>();
		List<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		for(int i=0;i<4;i++){
			data=oper.getCourse(formname[i]);
			for(int j=0;j<data.size();j++){
//				oper.insertCourse("Course", data.get(j), "11"+(i+2));
				studentInfo=oper.getStudentCourse(formname[i], data.get(j));
//				calByCourse(studentInfo,i,oper);
				Collections.sort(studentInfo);
				for(int k=0;k<studentInfo.size();k++){
					oper.insertCourseStudent("CourseStudent1"+(i+2), studentInfo.get(k).getCourse(), studentInfo.get(k).getStudentID(), studentInfo.get(k).getName(), studentInfo.get(k).getMajor(), studentInfo.get(k).getStartYear(), studentInfo.get(k).getTerm(),studentInfo.get(k).getScoreSum(), studentInfo.get(k).getCredit(), "11"+(i+2));
				}
			}
		}
//		connectionPool cp=new connectionPool();
//		StudentInfoDAO oper=new StudentInfoDAO(cp);
//		connectionPool cp1=new connectionPool();
//		CreateTable in=new CreateTable(cp1);
//		in.InitalTable();
//		ArrayList<StudentInfo> data=new ArrayList<StudentInfo>();
//		String []formname={"StudentInfo1531","StudentInfo1536","StudentInfo1537","StudentInfo1538","StudentInfo1539"};
//		for(int i=0;i<5;i++){
//		data=oper.getInfo(formname[i]);
//		for(int j=0;j<data.size();j++){
//			oper.insertStudentInfo("StudentInfo15", data.get(j));
//		}
//	}
		
	}
	
	public int judge(ArrayList<YearTerm> year,YearTerm data)
	{
		for(int i=0;i<year.size();i++){
			if(year.get(i).equal(data)==true)
				return 1;
		}
		return 0;
	}
	
	public ArrayList<YearTerm> getTerm(List<StudentInfo> studentInfo)
	{
		ArrayList<YearTerm> year=new ArrayList<YearTerm>();
		for(int i=0;i<studentInfo.size();i++){
			YearTerm temp=new YearTerm(studentInfo.get(i).getStartYear(),studentInfo.get(i).getTerm());
			if(judge(year,temp)==0)
				year.add(temp);
		}
		return year;
	}
	
	/**
	 * 计算每一课的情况
	 * @param studentInfo
	 * @throws SQLException 
	 */
	public void calByCourse(List<StudentInfo> studentInfo,int index,StudentInfoDAO oper) throws SQLException{
		ArrayList<YearTerm> year=getTerm(studentInfo);
		int []sum=new int[year.size()];
		int []sumPass=new int[year.size()];
		int []sumFail=new int[year.size()];
		float []passRate=new float[year.size()];
		for(int i=0;i<year.size();i++){
			sum[i]=0;
			sumPass[i]=0;
			sumFail[i]=0;
		}
		for(int i=0;i<studentInfo.size();i++){
			int k=0;
			for(k=0;k<year.size();k++){
				if(studentInfo.get(i).getStartYear()==year.get(k).getStartYear()&&studentInfo.get(i).getTerm()==year.get(k).getTerm())
					break;
			}
			sum[k]++;
			if(studentInfo.get(i).getScoreCal()<60)
				sumFail[k]++;
			else sumPass[k]++;
		}
		for(int i=0;i<year.size();i++){
			passRate[i]=(float)sumPass[i]/sum[i];
//			System.out.println(studentInfo.get(0).getCourse()+"\t"+passRate[i]+"\t"+sumFail[i]+"\t"+sum[i]+"\t"+year.get(i));
			oper.insertCourseGrade("CourseGrade", studentInfo.get(0).getCourse(), sum[i], sumFail[i], passRate[i], year.get(i).getStartYear(),year.get(i).getTerm(), "11"+(index+2));
			
		}
	}
	
	/**
	 * 获取每个学生的所有信息
	 * @throws SQLException 
	 */
	public void getDatabyName() throws SQLException{
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		connectionPool cp1=new connectionPool();
		CreateTable in=new CreateTable(cp1);
		in.InitalTable();
		String []formname={"StudentInfo12","StudentInfo13","StudentInfo14","StudentInfo15"};
		ArrayList<String> data=new ArrayList<String>();
		List<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		int []sumPass={0,0,0,0};
		int []sumFail={0,0,0,0};
		int []sum={0,0,0,0};
		int []sumNumber={0,0,0,0};
		float []passRate={0,0,0,0};
		for(int i=0;i<4;i++){
			List<GradeInfo> info=new ArrayList<GradeInfo>();
			data=oper.getNo(formname[i]);
			sumNumber[i]=data.size();
			for(int j=0;j<data.size();j++){
				studentInfo=oper.getInfoByNo(formname[i], data.get(j));
//				for(int k=0;k<studentInfo.size();k++){
////					if(studentInfo.get(k).getStartYear()==2012+i){
//						sum[i]++;
//						if(studentInfo.get(k).getScoreCal()<60)
//							sumFail[i]++;
//						else sumPass[i]++;
////					}
//				}
				info.add(calByName(studentInfo,i,oper));
			}
			Collections.sort(info);
			for(int j=0;j<info.size();j++){
//				oper.insertGrade("Grade", info.get(j).getStudentID(),info.get(j).getName(), info.get(j).getCreditPass(), info.get(j).getCreditFail(), info.get(j).getSumCredit(), info.get(j).getGradpoint(), j+1,"11"+(i+2),info.get(j).getMajor());
				oper.insertGrade("GradeFirst", info.get(j).getStudentID(),info.get(j).getName(), info.get(j).getCreditPass(), info.get(j).getCreditFail(), info.get(j).getSumCredit(), info.get(j).getGradpoint(), j+1,"11"+(i+2),info.get(j).getMajor());
			}
		}
//		for(int i=0;i<4;i++){
//			passRate[i]=(float)sumPass[i]/sum[i];
//			oper.insertAllGrade("AllGrade",sumPass[i],sumFail[i],sum[i],sumNumber[i],passRate[i],"11"+(i+2));
////			oper.insertAllGrade("AllGradeFirst",sumPass[i],sumFail[i],sum[i],sumNumber[i],passRate[i],"11"+(i+2));
//		}
	}
	/**
	 * 计算年级排名信息
	 * @param studentInfo
	 * @param index
	 */
	public GradeInfo calByName(List<StudentInfo> studentInfo,int index,StudentInfoDAO oper){
		ArrayList<YearTerm> year=getTerm(studentInfo);
		GradeInfo grade=new GradeInfo();
		float []sumCredit=new float[year.size()];
		float []creditPass=new float[year.size()];
		float []creditFail=new float[year.size()];
		float []gradpoint=new float[year.size()];
		grade.setStudentID(studentInfo.get(0).getStudentID());
		grade.setName(studentInfo.get(0).getName());
		grade.setMajor(studentInfo.get(0).getMajor());
		grade.setCreditFail(0);
		grade.setCreditPass(0);
		grade.setGradpoint(0.0f);
		for(int i=0;i<year.size();i++){
			sumCredit[i]=0;
			creditPass[i]=0;
			creditFail[i]=0;
			gradpoint[i]=0;
		}
		for(int i=0;i<studentInfo.size();i++){
			if(studentInfo.get(i).getStartYear()==2012+index){
				int k=0;
				for(k=0;k<year.size();k++){
					if(studentInfo.get(i).getStartYear()==year.get(k).getStartYear()&&studentInfo.get(i).getTerm()==year.get(k).getTerm())
						break;
				}
				float tempGradpoint=0;
				grade.setSumCredit(grade.getSumCredit()+studentInfo.get(i).getCredit());
				if(studentInfo.get(i).getGradPoint()<=0)
					tempGradpoint=0;
				else
					tempGradpoint=studentInfo.get(i).getGradPoint();
				grade.setGradpoint(grade.getGradpoint()+tempGradpoint*studentInfo.get(i).getCredit());
				sumCredit[k]=sumCredit[k]+studentInfo.get(i).getCredit();
				gradpoint[k]=gradpoint[k]+tempGradpoint*studentInfo.get(i).getCredit();
				if(studentInfo.get(i).getScoreCal()<60){
					grade.setCreditFail(grade.getCreditFail()+studentInfo.get(i).getCredit());
					creditFail[k]=creditFail[k]+studentInfo.get(i).getCredit();
				}
				else{
					grade.setCreditPass(grade.getCreditPass()+studentInfo.get(i).getCredit());
					creditPass[k]=creditPass[k]+studentInfo.get(i).getCredit();
				}
			}
		}
//		for(int i=0;i<year.size();i++){
//			gradpoint[i]=gradpoint[i]/sumCredit[i];
//			//System.out.println(studentInfo.get(0).getName()+"\t"+creditPass[i]+"\t"+creditFail[i]+"\t"+sumCredit[i]+"\t"+gradpoint[i]+"11"+(index+2));
//		}
		if(grade.getSumCredit()==0)
			grade.setGradpoint(0);
		else
			grade.setGradpoint(grade.getGradpoint()/grade.getSumCredit());
		return grade;	
	}
	
	/**
	 * 获取每个专业的排名信息
	 * @throws SQLException 
	 */
	public void getDatabyMajor() throws SQLException{
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		connectionPool cp1=new connectionPool();
		CreateTable in=new CreateTable(cp1);
		in.InitalTable();
		String [][]formname={{"StudentInfo1231","StudentInfo1236","StudentInfo1237","StudentInfo1237A","StudentInfo1238","StudentInfo1239"},
				{"StudentInfo1331","StudentInfo1336","StudentInfo1337","StudentInfo1337A","StudentInfo1338","StudentInfo1339"},
				{"StudentInfo1431","StudentInfo1436","StudentInfo1437","StudentInfo1437A","StudentInfo1438","StudentInfo1439"}};
		String []formname1={"StudentInfo1531","StudentInfo1536","StudentInfo1537","StudentInfo1538","StudentInfo1539"};
		ArrayList<String> data=new ArrayList<String>();
		List<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		int [][]sumPass={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		int [][]sumFail={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		int [][]sum={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		int [][]sumNumber={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		float [][]passRate={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		String [][]major=new String[3][6];
		int []sumPass1={0,0,0,0,0};
		int []sumFail1={0,0,0,0,0};
		int []sum1={0,0,0,0,0};
		int []sumNumber1={0,0,0,0,0};
		float []passRate1={0,0,0,0,0};
		String []major1=new String[5];
		for(int i=0;i<3;i++){
			for(int k=0;k<6;k++){
				List<GradeInfo> info=new ArrayList<GradeInfo>();
				data=oper.getNo(formname[i][k]);
				sumNumber[i][k]=data.size();
				sum[i][k]=data.size();
				for(int j=0;j<data.size();j++){
					studentInfo=oper.getInfoByNo(formname[i][k], data.get(j));
					info.add(calByName(studentInfo,i,oper));
//					for(int m=0;m<studentInfo.size();m++){
//						sum[i][k]++;
//						if(studentInfo.get(m).getScoreCal()<60)
//							sumFail[i][k]++;
//						else sumPass[i][k]++;
//					}
				}
//				major[i][k]=studentInfo.get(0).getMajor();
				Collections.sort(info);
				for(int j=0;j<info.size();j++){
					oper.insertGrade("Major", info.get(j).getStudentID(),info.get(j).getName(), info.get(j).getCreditPass(), info.get(j).getCreditFail(), info.get(j).getSumCredit(), info.get(j).getGradpoint(), j+1,"11"+(i+2),info.get(j).getMajor());
					System.out.println(1);
				}
			}
		}
//		for(int i=0;i<3;i++){
//			for(int k=0;k<6;k++){
//				passRate[i][k]=(float)sumPass[i][k]/sum[i][k];
//				oper.insertAllMajor("AllMajor",sumPass[i][k],sumFail[i][k],sum[i][k],sumNumber[i][k],passRate[i][k],major[i][k],"11"+(i+2));
//			}
//		}
		for(int i=0;i<5;i++){
			List<GradeInfo> info=new ArrayList<GradeInfo>();
			data=oper.getNo(formname1[i]);
			sumNumber1[i]=data.size();
			sum1[i]=data.size();
			for(int j=0;j<data.size();j++){
				studentInfo=oper.getInfoByNo(formname1[i], data.get(j));
				info.add(calByName(studentInfo,i,oper));
//				for(int m=0;m<studentInfo.size();m++){
//					sum1[i]++;
//					if(studentInfo.get(m).getScoreCal()<60)
//						sumFail1[i]++;
//					else sumPass1[i]++;
//				}
			}
//			major1[i]=studentInfo.get(0).getMajor();
			Collections.sort(info);
			for(int j=0;j<info.size();j++){
				oper.insertGrade("Major", info.get(j).getStudentID(),info.get(j).getName(), info.get(j).getCreditPass(), info.get(j).getCreditFail(), info.get(j).getSumCredit(), info.get(j).getGradpoint(), j+1,"115",info.get(j).getMajor());
				System.out.println(1);
			}
		}
//		for(int i=0;i<5;i++){
//			passRate1[i]=(float)sumPass1[i]/sum1[i];
//			oper.insertAllMajor("AllMajor", sumPass1[i], sumFail1[i], sum1[i], sumNumber1[i], passRate1[i], major1[i], "115");
//		}
	}
	
	/**
	 * 获取每个班级的排名信息
	 * @throws SQLException 
	 */
	public void getDatabyClass() throws SQLException{
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		connectionPool cp1=new connectionPool();
		CreateTable in=new CreateTable(cp1);
		in.InitalTable();
		String []formname={"StudentInfo12","StudentInfo13","StudentInfo14","StudentInfo15"};
		ArrayList<String> data=new ArrayList<String>();
		ArrayList<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		ArrayList<StudentInfo> classname=new ArrayList<StudentInfo>();
		ArrayList<String> name=new ArrayList<String>();
		for(int i=0;i<4;i++){
			data=oper.getClass(formname[i]);
			for(int j=0;j<data.size();j++){
				List<GradeInfo> info=new ArrayList<GradeInfo>();
				connectionPool cp2=new connectionPool();
				CreateTable in1=new CreateTable(cp2);
				in1.InitalTable1();
				int sumPass=0;
				int sumFail=0;
				int sum=0;
				int sumNumber=0;
				float passRate=0;
				classname=oper.getInfoByClass(formname[i], data.get(j));
				for(int k=0;k<classname.size();k++){
					oper.insertStudentInfo("temp", classname.get(k));
				}
				name=oper.getNo("temp");
				sumNumber=name.size();
				for(int m=0;m<name.size();m++){
					studentInfo=oper.getInfoByNo("temp", name.get(m));
					info.add(calByName(studentInfo,i,oper));
//					for(int n=0;n<studentInfo.size();n++){
//						sum++;
//						if(studentInfo.get(n).getScoreCal()<60)
//							sumFail++;
//						else sumPass++;
//					}
				}
				Collections.sort(info);
				for(int m=0;m<info.size();m++){
					oper.insertClass("ClassCon", info.get(m).getStudentID(),info.get(m).getName(), info.get(m).getCreditPass(), info.get(m).getCreditFail(), info.get(m).getSumCredit(), info.get(m).getGradpoint(), m+1,"11"+(i+2),info.get(m).getMajor(),data.get(j));
				}
//				passRate=(float)sumPass/sum;
//				oper.insertAllClass("AllClass", sumPass, sumFail, sum, sumNumber, passRate, studentInfo.get(0).getMajor(), data.get(j), 
//						"11"+(i+2));
				
			}
		}
	}
	
	/**
	 * 获得挂科学生名单
	 * @throws SQLException 
	 */
	public void getFail() throws SQLException{
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		connectionPool cp1=new connectionPool();
		CreateTable in=new CreateTable(cp1);
		in.InitalTable();
		String [][]formname={{"StudentInfo1231","StudentInfo1236","StudentInfo1237","StudentInfo1237A","StudentInfo1238","StudentInfo1239"},
				{"StudentInfo1331","StudentInfo1336","StudentInfo1337","StudentInfo1337A","StudentInfo1338","StudentInfo1339"},
				{"StudentInfo1431","StudentInfo1436","StudentInfo1437","StudentInfo1437A","StudentInfo1438","StudentInfo1439"},
				{"StudentInfo1531","StudentInfo1536","StudentInfo1537","StudentInfo1538","StudentInfo1539"}};
		ArrayList<String> data=new ArrayList<String>();
		List<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		ArrayList<StudentFail[]> plan=getPlane();
		for(int i=0;i<3;i++){
			for(int m=0;m<6;m++){
				data=oper.getNo(formname[i][m]);
				for(int j=0;j<data.size();j++){
					studentInfo=oper.getInfoByNo(formname[i][m], data.get(j));
					StudentFail[] temp=calByFail(studentInfo, i);
					if(pass(temp,plan.get(i*6+m))==0){
//						operin(studentInfo,i,oper);
						float []need=new float[10];
						for(int n=0;n<10;n++){
							if(plan.get(i*6+m)[n].getSumCredit()-temp[n].getCreditPass()<0)
								need[n]=0;
							else
								need[n]=plan.get(i*6+m)[n].getCreditPass()-temp[n].getCreditPass();
						}
						oper.insertFail("Fail", temp[0].getStudentID(),temp[0].getName(),temp[0].getCreditPass(), need[0], plan.get(i*6+m)[0].getSumCredit(), temp[0].getGradpoint(), temp[0].getFailsum(), temp[1].getCreditPass(), need[1], plan.get(i*6+m)[1].getSumCredit(), temp[1].getGradpoint(), temp[1].getFailsum(), temp[2].getCreditPass(), need[2], plan.get(i*6+m)[2].getSumCredit(), temp[2].getGradpoint(),temp[2].getFailsum(), temp[3].getCreditPass(), need[3], plan.get(i*6+m)[3].getSumCredit(), temp[3].getGradpoint(), temp[3].getFailsum(),temp[4].getCreditPass(), need[4], plan.get(i*6+m)[4].getSumCredit(), temp[4].getGradpoint(), temp[4].getFailsum(), temp[5].getCreditPass(),need[5], plan.get(i*6+m)[5].getSumCredit(), temp[5].getGradpoint(), temp[5].getFailsum(), temp[6].getCreditPass(), need[6], plan.get(i*6+m)[6].getSumCredit(), temp[6].getGradpoint(), temp[6].getFailsum(), temp[7].getCreditPass(), need[7], plan.get(i*6+m)[7].getSumCredit(), temp[7].getGradpoint(), temp[7].getFailsum(), temp[8].getCreditPass(), need[8], plan.get(i*6+m)[8].getSumCredit(), temp[8].getGradpoint(), temp[8].getFailsum(), temp[9].getCreditPass(), need[9], plan.get(i*6+m)[9].getSumCredit(), temp[9].getGradpoint(), temp[9].getFailsum(),temp[0].getGrade(),temp[0].getMajor(),temp[0].getClassName());
					}
				}
			}
		}
		for(int m=0;m<5;m++){
			ArrayList<StudentFail> info=new ArrayList<StudentFail>();
			data=oper.getNo(formname[3][m]);
			for(int j=0;j<data.size();j++){
				studentInfo=oper.getInfoByNo(formname[3][m], data.get(j));
				StudentFail[] temp=calByFail(studentInfo, 3);
				if(pass(temp,plan.get(3*6+m))==0){
//					operin(studentInfo,3,oper);
					float []need=new float[10];
					for(int n=0;n<10;n++){
						if(plan.get(3*6+m)[n].getSumCredit()-temp[n].getCreditPass()<0)
							need[n]=0;
						else
							need[n]=plan.get(3*6+m)[n].getCreditPass()-temp[n].getCreditPass();
					}
					oper.insertFail("Fail", temp[0].getStudentID(),temp[0].getName(),temp[0].getCreditPass(), need[0], plan.get(3*6+m)[0].getSumCredit(), temp[0].getGradpoint(), temp[0].getFailsum(), temp[1].getCreditPass(), need[1], plan.get(3*6+m)[1].getSumCredit(), temp[1].getGradpoint(), temp[1].getFailsum(), temp[2].getCreditPass(), need[2], plan.get(3*6+m)[2].getSumCredit(), temp[2].getGradpoint(),temp[2].getFailsum(), temp[3].getCreditPass(), need[3], plan.get(3*6+m)[3].getSumCredit(), temp[3].getGradpoint(), temp[3].getFailsum(),temp[4].getCreditPass(), need[4], plan.get(3*6+m)[4].getSumCredit(), temp[4].getGradpoint(), temp[4].getFailsum(), temp[5].getCreditPass(),need[5], plan.get(3*6+m)[5].getSumCredit(), temp[5].getGradpoint(), temp[5].getFailsum(), temp[6].getCreditPass(), need[6], plan.get(3*6+m)[6].getSumCredit(), temp[6].getGradpoint(), temp[6].getFailsum(), temp[7].getCreditPass(), need[7], plan.get(3*6+m)[7].getSumCredit(), temp[7].getGradpoint(), temp[7].getFailsum(), temp[8].getCreditPass(), need[8], plan.get(3*6+m)[8].getSumCredit(), temp[8].getGradpoint(), temp[8].getFailsum(), temp[9].getCreditPass(), need[9], plan.get(3*6+m)[9].getSumCredit(), temp[9].getGradpoint(), temp[9].getFailsum(),temp[0].getGrade(),temp[0].getMajor(),temp[0].getClassName());
				}
			}
		}
		
	}
	/**
	 * 计算挂科学生情况
	 * @param studentInfo
	 * @param i
	 * @param oper
	 * @return
	 */
	public StudentFail[] calByFail(List<StudentInfo> studentInfo,int index){
		StudentFail[] info=new StudentFail[10];
		for(int i=0;i<10;i++)
			info[i]=new StudentFail();
		for(int i=0;i<10;i++){
			info[i].setStudentID(studentInfo.get(0).getStudentID());
			info[i].setName(studentInfo.get(0).getName());
			info[i].setMajor(studentInfo.get(0).getMajor());
			info[i].setGrade("11"+(index+2));
			info[i].setClassName(studentInfo.get(0).getClassName());
			info[i].setCreditFail(0);
			info[i].setCreditPass(0);
			info[i].setSumCredit(0);
			info[i].setFailsum(0);
			info[i].setGradpoint(0);
		}
		float sumCredit=0;
		float gradpoint=0;
		int failsum=0;
		float creditPass=0;
		float creditFail=0;
		for(int i=0;i<studentInfo.size();i++){
			int flag=studentInfo.get(i).getCourseNature();
			if(flag<0)
				flag=3;
			info[flag].setSumCredit(info[flag].getSumCredit()+studentInfo.get(i).getCredit());
			float temp;
			if(studentInfo.get(i).getGradPoint()<=0)
				temp=0;
			else
				temp=studentInfo.get(i).getGradPoint();
			gradpoint=gradpoint+studentInfo.get(i).getCredit()*temp;
			info[flag].setGradpoint(info[flag].getGradpoint()+studentInfo.get(i).getCredit()*temp);
			if(studentInfo.get(i).getScoreCal()<60){
				info[flag].setFailsum(info[flag].getFailsum()+1);
				info[flag].setCreditFail(info[flag].getCreditFail()+studentInfo.get(i).getCredit());
			}
			else {
				info[flag].setCreditPass(info[flag].getCreditPass()+studentInfo.get(i).getCredit());
			}
		}
		for(int i=0;i<9;i++){
			float temp=info[i].getGradpoint();
			float tempSum=info[i].getSumCredit();
			float tempGradepoint;
			if(info[i].getFailsum()<0){
				info[i].setCreditFail(0);
				info[i].setFailsum(0);
			}
			if(tempSum==0)
				tempGradepoint=0;
			else
				tempGradepoint=temp/tempSum;
			info[i].setGradpoint(tempGradepoint);
			
			creditFail=creditFail+info[i].getCreditFail();
			creditPass=creditPass+info[i].getCreditPass();
			sumCredit=sumCredit+info[i].getSumCredit();
			failsum=failsum+info[i].getFailsum();
		}
		gradpoint=gradpoint/sumCredit;
		info[9].setCreditFail(creditFail);
		info[9].setCreditPass(creditPass);
		info[9].setSumCredit(sumCredit);
		info[9].setFailsum(failsum);
		info[9].setGradpoint(gradpoint);
		return info;
	}
	
	/**
	 * 将挂科学生科目存入数据库
	 * @param studentInfo
	 * @param index
	 * @param oper
	 * @throws SQLException 
	 */
	public void operin(List<StudentInfo> studentInfo,int index,StudentInfoDAO oper) throws SQLException{
		for(int i=0;i<studentInfo.size();i++){
			if(studentInfo.get(i).getScoreCal()<60){
				oper.insertFailCourse("FailCourse",studentInfo.get(i).getStudentID(),studentInfo.get(i).getName(),studentInfo.get(i).getCourse(),studentInfo.get(i).getStartYear(),studentInfo.get(i).getTerm(),studentInfo.get(i).getCourseNature(),studentInfo.get(i).getRepair(),"11"+(index+2));
			}
		}
	}
	
	
	public ArrayList<StudentFail[]> getPlane(){
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		String [][]formname={{"StudentInfo1231","StudentInfo1236","StudentInfo1237","StudentInfo1237A","StudentInfo1238","StudentInfo1239"},
				{"StudentInfo1331","StudentInfo1336","StudentInfo1337","StudentInfo1337A","StudentInfo1338","StudentInfo1339"},
				{"StudentInfo1431","StudentInfo1436","StudentInfo1437","StudentInfo1437A","StudentInfo1438","StudentInfo1439"},
				{"StudentInfo1531","StudentInfo1536","StudentInfo1537","StudentInfo1538","StudentInfo1539"}};
		String []major={"物联网工程","信息管理与信息系统","计算机科学与技术","计算机科学与技术(卓越工程师)","软件工程","网络工程"};
		String []major1={"物联网工程","信息管理与信息系统","计算机科学与技术","软件工程","网络工程"};
		List<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		ArrayList<StudentFail[]> plan=new ArrayList<>();
		for(int i=0;i<3;i++){
			for(int m=0;m<6;m++){
				String no=null;
				no=oper.getNobyClasscon("ClassCon",major[m],"11"+(i+2));
				studentInfo=oper.getInfoByNo(formname[i][m], no);
				StudentFail[] temp=calByFail(studentInfo, i);
				plan.add(temp);
			}
		}
		for(int m=0;m<5;m++){
			String no=null;
			no=oper.getNobyClasscon("ClassCon",major1[m], "115");
			studentInfo=oper.getInfoByNo(formname[3][m], no);
			StudentFail[] temp=calByFail(studentInfo, 3);
			plan.add(temp);
		}
		return plan;
	}
	
	/**
	 * 判断是否缺少学分
	 * @return
	 */
	public int pass(StudentFail temp[],StudentFail plan[]){
		int flag=1;
		for(int i=0;i<9;i++){
			if(temp[i].getCreditPass()<plan[i].getSumCredit()){
				flag=0;
				break;
			}
		}
		return flag;
	}
	

	/**
	 * 获取每个专业一门课的所有信息
	 * @throws SQLException 
	 */
	public void getDatabyCourseMajor() throws SQLException{
		connectionPool cp=new connectionPool();
		StudentInfoDAO oper=new StudentInfoDAO(cp);
		connectionPool cp1=new connectionPool();
		CreateTable in=new CreateTable(cp1);
		in.InitalTable();
		String []formname={"StudentInfo12","StudentInfo13","StudentInfo14","StudentInfo15"};
		String []major={"物联网工程","网络工程","计算机科学与技术","计算机科学与技术(卓越工程师)","软件工程","信息管理与信息系统"};
		ArrayList<String> data=new ArrayList<String>();
		List<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		for(int i=0;i<4;i++){
			for(int m=0;m<6;m++){
				data=oper.getCourseMajor(formname[i],major[m]);
				for(int j=0;j<data.size();j++){
//					studentInfo=oper.getStudentCourseMajor(formname[i], data.get(j),major[m]);
					oper.insertCourseMajor("CourseMajor", data.get(j), major[m],"11"+(i+2));
//					calByCourseMajor(studentInfo,i,oper,major[m]);
				}
			}
		}
	}
	
	/**
	 * 计算每个专业每一科的情况
	 * @param studentInfo
	 * @throws SQLException 
	 */
	public void calByCourseMajor(List<StudentInfo> studentInfo,int index,StudentInfoDAO oper,String major) throws SQLException{
		int sum=0;
		int sumPass=0;
		int sumFail=0;
		float passRate=0.0f;
		for(int i=0;i<studentInfo.size();i++){
			if(studentInfo.get(i).getRepair()==-1){
				sum++;
				if(studentInfo.get(i).getScoreCal()<60)
					sumFail++;
				else sumPass++;
			}
		}
		if(sum==0)
			passRate=0;
		else
			passRate=(float)sumPass/sum;
		oper.insertCourseGradeMajor("CourseGradeMajor", studentInfo.get(0).getCourse(), sum, sumFail, passRate, studentInfo.get(0).getStartYear(),studentInfo.get(0).getTerm(),major, "11"+(index+2));
	}
	
	
	
	
	/**
	 * 获取文件中的信息存入数据库中
	 * @throws Exception
	 */
	public void toDatabaseFromFile() throws Exception {
		connectionPool cp=new connectionPool();
		CreateTable table=new CreateTable(cp);
		table.InitalTable();
		String address="//Volumes//Transcend//文件//实验室//12级学生成绩.xls";
		String address1="//Volumes//Transcend//文件//实验室//13级学生成绩.xls";
		String address2="//Volumes//Transcend//文件//实验室//14级学生成绩.xls";
		String address3="//Volumes//Transcend//文件//实验室//1531.xls";
		String address4="//Volumes//Transcend//文件//实验室//1536.xls";
		String address5="//Volumes//Transcend//文件//实验室//1537.xls";
		String address6="//Volumes//Transcend//文件//实验室//1538.xls";
		String address7="//Volumes//Transcend//文件//实验室//1539.xls";
		toDatabase oper=new toDatabase();
		ArrayList<StudentInfo> info12=new ArrayList<StudentInfo>();
		info12=oper.getInfoDoc(address);
		ArrayList<StudentInfo> info13=new ArrayList<StudentInfo>();
		info13=oper.getInfoDoc(address1);
		ArrayList<StudentInfo> info14=new ArrayList<StudentInfo>();
		info14=oper.getInfoDoc(address2);
		ArrayList<StudentInfo> info1531=new ArrayList<StudentInfo>();
		info1531=oper.getInfoDoc(address3);
		ArrayList<StudentInfo> info1536=new ArrayList<StudentInfo>();
		info1536=oper.getInfoDoc(address4);
		ArrayList<StudentInfo> info1537=new ArrayList<StudentInfo>();
		info1537=oper.getInfoDoc(address5);
		ArrayList<StudentInfo> info1538=new ArrayList<StudentInfo>();
		info1538=oper.getInfoDoc(address6);
		ArrayList<StudentInfo> info1539=new ArrayList<StudentInfo>();
		info1539=oper.getInfoDoc(address7);
		connectionPool cp1=new connectionPool();
		StudentInfoDAO in=new StudentInfoDAO(cp1);
		for(int i=0;i<info12.size();i++)
			in.insertStudentInfo12(info12.get(i));
		for(int i=0;i<info13.size();i++)
			in.insertStudentInfo13(info13.get(i));
		for(int i=0;i<info14.size();i++)
			in.insertStudentInfo14(info14.get(i));
		for(int i=0;i<info1531.size();i++)
			in.insertStudentInfo1531(info1531.get(i));
		for(int i=0;i<info1536.size();i++)
			in.insertStudentInfo1536(info1536.get(i));
		for(int i=0;i<info1537.size();i++)
			in.insertStudentInfo1537(info1537.get(i));
		for(int i=0;i<info1538.size();i++)
			in.insertStudentInfo1538(info1538.get(i));
		for(int i=0;i<info1539.size();i++)
			in.insertStudentInfo1539(info1539.get(i));
		
    }
	/**
	 * 读取excel文件
	 * @param address
	 * @return
	 * @throws IOException
	 */
	public ArrayList<StudentInfo> getInfoDoc(String address) throws IOException
	{
         ArrayList<StudentInfo> studentInfo=new ArrayList<StudentInfo>();
		try{
			FileInputStream readFile = new FileInputStream(address);

			//创建一个WorkBook，从指定的文件流中创建，即上面指定了的文件流

			HSSFWorkbook wb = new HSSFWorkbook(readFile);

			//注意，如果不能确定具体的名称，可以用getSheetAt(int)方法取得Sheet

			HSSFSheet st = wb.getSheet("Sheet1");
			int firstRowIndex = st.getFirstRowNum();  
	        int lastRowIndex = st.getLastRowNum();
	        for(int index=firstRowIndex+1;index<=lastRowIndex;index++)
	        {
	        	//获得一行，同上，如果此行没有被创建过则抛出异常

	    		HSSFRow row = st.getRow(index);
	    		//获取一个单元格，如果没有被创建过则抛出异常
	    		if(row != null){  
	                int firstCellIndex = row.getFirstCellNum();  
	                int lastCellIndex = row.getLastCellNum();
	                StudentInfo info=new StudentInfo();
	                ArrayList<String> value = new ArrayList<String>();
	                
	                for(int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex ++){  
	                    Cell cell = row.getCell(cIndex);
//	                    System.out.println(row+","+cIndex);
	                    if(cell!=null)
	                    	value.add(cell.toString());
	                    else
	                    	value.add("");
	                    //System.out.print(cell.toString()+"\t");
	                }  
	                //System.out.println();
	                if(value.get(0)!="")
	                	info.setStudentID(value.get(0));
	                if(value.get(1)!="")
	                	info.setName(value.get(1));
	                if(value.get(2)!="")
	                	info.setCourse(value.get(2));
	                if(value.get(3)!="")
	                	info.setCredit(Float.parseFloat(value.get(3)));
	                if(value.get(4)!="")
	                	info.setScoreSum(value.get(4));
	                int flag=0;
	                if(value.get(5)!=""){
	                	if(value.get(5).equals("缺成绩")==true)
		                	flag=0;
		                else if(value.get(5).equals("2014集中重修")==true)
		                	flag=1;
		                else if(value.get(5).equals("缺考")==true)
		                	flag=2;
		                else if(value.get(5).equals("无资格")==true)
		                	flag=3;
		                info.setRemark(flag);
	                }
	                if(value.get(6)!="")
	                	info.setScoreCal(Float.parseFloat(value.get(6)));
	                if(value.get(7)!="")
	                	info.setGradPoint(Float.parseFloat(value.get(7)));
	                if(value.get(8)!=""){
	                	flag=0;
		                if(value.get(8).equals("专业必修")==true)
		                	flag=0;
		                else if(value.get(8).equals("学科基础必修")==true)
		                	flag=1;
		                else if(value.get(8).equals("集中实践教学环节")==true)
		                	flag=2;
		                else if(value.get(8).equals("学科基础选修")==true)
		                	flag=3;
		                else if(value.get(8).equals("公共必修")==true)
		                	flag=4;
		                else if(value.get(8).equals("全院素质任选")==true)
		                	flag=5;
		                else if(value.get(8).equals("通识教育")==true)
		                	flag=6;
		                else if(value.get(8).equals("公共基础")==true)
		                	flag=7;
		                else if(value.get(8).equals("专业类基础")==true)
		                	flag=8;
		                info.setCourseNature(flag);
	                }
	                if(value.get(9)!=""){
	                	flag=0;
	                	if(value.get(9).equals("集中实践教学环节")==true)
	                		flag=0;
	                	else if(value.get(9).equals("全院素质任选")==true)
		                	flag=1;
		                info.setCourseAscription(flag);
	                }
	                if(value.get(10)!="")
	                	info.setRepair(Integer.parseInt(value.get(10).substring(0, 1)));
	                if(value.get(11)!="")
	                	info.setCourseNo(value.get(11));
	                if(value.get(12)!="")
	                	info.setStartYear(Integer.parseInt(value.get(12).substring(0,4)));
	                if(value.get(13)!="")
	                	info.setTerm(Integer.parseInt(value.get(13).substring(0, 1)));
	                if(value.get(14)!="")
	                	info.setCollege(value.get(14));
	                if(value.get(15)!="")
	                	info.setMajor(value.get(15));
	                if(value.get(16)!="")
	                	info.setClassName(value.get(16));
	                studentInfo.add(info);       
	            }
	        }
	      //记得关闭流
	        readFile.close();
		}catch (FileNotFoundException e) {  
            // TODO 自动生成 catch 块  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO 自动生成 catch 块  
            e.printStackTrace();  
        } 
        return studentInfo;
	}

}