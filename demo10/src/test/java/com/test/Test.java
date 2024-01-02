package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.Account;
import com.mapper.AccountMapper;

public class Test {
	
	@org.junit.Test
	public void testTransfer() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        
        Account beforeAccount1 = accountMapper.selectById(1);
        Account beforeAccount2 = accountMapper.selectById(2);
        System.out.println("转账前：");
        System.out.println(beforeAccount1);
        System.out.println(beforeAccount2);
        
        double transfer = 25;
        Account account1 = new Account();
        account1.setId(1);
        account1.setBalance(beforeAccount1.getBalance() - transfer);
        accountMapper.updateBalance(account1);
        
        Account account2 = new Account();
        account2.setId(2);
        account2.setBalance(beforeAccount2.getBalance() + transfer);
        accountMapper.updateBalance(account2);
        sqlSession.commit();
        
        Account afterAccount1 = accountMapper.selectById(1);
        Account afterAccount2 = accountMapper.selectById(2);
        System.out.println("转账后：");
        System.out.println(afterAccount1);
        System.out.println(afterAccount2);
        
	}
	
}
