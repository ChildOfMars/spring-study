package com.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.AccountDao;

@Repository
public class AccountDaoImpl implements AccountDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int updateAccount(String username, double money) {
	    String sql = "update account set balance = balance + ? where username = ?";
	    int rows = jdbcTemplate.update(sql, money, username);
		return rows;
	}

}
