package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectAdvisor {
	public void beforeSave() {
		System.out.println("在save之前执行");
	}
	public void afterSave() {
		System.out.println("在save之后执行");
	}
	public void afterReturn() {
		System.out.println("在return后执行");
	}
	public void afterThrowing() {
		System.out.println("在抛出异常后执行");
	}
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around之前执行的");
		Object proceed = pjp.proceed();
		System.out.println("around之后执行的");
		return proceed;
	}
}
