package com.yuan.springdemo3;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out ,String in, double money){
            accountDao.outMoney(out,money);
        int a = 1/0;
            accountDao.inmoney(in,money);

    }
}
