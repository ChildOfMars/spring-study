package com.mapper;

import com.bean.Account;

public interface AccountMapper {
	Account selectById(int id);
	
	int updateBalance(Account account);
}
