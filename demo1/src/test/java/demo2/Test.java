package demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo2.bean.Hospital;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hospital bean = context.getBean("hospital",Hospital.class);
		System.out.println(bean.toString());
		

	}

}
