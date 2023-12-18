package com;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.config.MyConfig;
import com.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:beans.xml")
@ContextConfiguration(classes = MyConfig.class)
public class Test {
	@Autowired
	private AccountService accountService;
	
	@org.junit.Test
	public void testTransfer() {
//		boolean flag = accountService.transfer("张三", "李四", 100);
		boolean flag = accountService.transfer("李四", "张三", 100);
		System.out.println(flag);
	}
}
