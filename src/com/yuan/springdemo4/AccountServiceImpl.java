package com.yuan.springdemo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.MANDATORY)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out ,String in, double money){
            accountDao.outMoney(out,money);
//        int a = 1/0;
            accountDao.inmoney(in,money);

    }
}
