package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.bean.Student;
import com.dao.StudentDao;
import com.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;

	@Override
	public boolean calculate(int id) {
		Student student = studentDao.queryStudentById(id);
		
		try {
			float sumScore = student.getChinese() + student.getMath() + student.getEnglish();
			studentDao.updateSumScore(id, sumScore);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			return false;
		}
	}

}
