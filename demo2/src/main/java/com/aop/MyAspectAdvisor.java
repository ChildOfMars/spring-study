package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.bean.Student;

public class MyAspectAdvisor {
	public void beforeSave() {
		System.out.println("在save之前执行");
		System.out.println("202158359072谭潇彬");
		
	}
}
