package com.dao;

import com.bean.Student;

public interface StudentDao {
	Student queryStudentById(int id);
	void updateSumScore(int id,float sumScore);
}
