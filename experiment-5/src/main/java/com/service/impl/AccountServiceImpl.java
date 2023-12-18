package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.dao.AccountDao;
import com.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;

	@Override
	public boolean transfer(String from, String to, double money) {
		try {
			accountDao.updateAccount(from, -money);
//			int i = 1 / 0;
			accountDao.updateAccount(to, money);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			return false;
		}
	}

}
