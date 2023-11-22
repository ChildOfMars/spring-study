package demo1.service.impl;

import demo1.bean.Student;
import demo1.dao.StudentDao;
import demo1.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	
	
	public StudentServiceImpl() {
		System.out.println("StudentServiceImpl的构造方法执行了");
	}



	public StudentDao getStudentDao() {
		return studentDao;
	}



	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}



	@Override
	public void registry(Student stu) {
		studentDao.addStudent(stu);
		
	}





}
