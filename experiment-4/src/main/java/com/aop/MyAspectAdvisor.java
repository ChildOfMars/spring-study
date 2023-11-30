package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectAdvisor {
	@Pointcut("execution(* com.dao.impl.*.save(..))")
	public void myPointcut() {}
	
	@Before("myPointcut()")
	public void beforeSave() {
		System.out.println("在save之前执行");
	}
	@After("myPointcut()")
	public void afterSave() {
		System.out.println("在save之后执行");
	}
	@AfterReturning("myPointcut()")
	public void afterReturn() {
		System.out.println("在return后执行");
	}
	@AfterThrowing("myPointcut()")
	public void afterThrowing() {
		System.out.println("在抛出异常后执行");
	}
	@Around("myPointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around之前执行的");
		Object proceed = pjp.proceed();
		System.out.println("around之后执行的");
		return proceed;
	}
}
