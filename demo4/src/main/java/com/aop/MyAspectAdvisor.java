package com.aop;

import java.time.LocalDateTime;

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
	@Pointcut("execution(* com.*.impl.*.save*(..))")
	public void myPointcut() {}
	
	@Before("myPointcut()")
	public void beforeSave() {
		System.out.println("在save之前执行，时间：" + LocalDateTime.now());
	}
	
}
