package com.factory;

import com.bean.Student;

public class MyFactory {
	public static Student staticBuidStudent() {
		return new Student();
	}
	
	public Student dynamicBuidStudent() {
		return new Student();
	}
}
