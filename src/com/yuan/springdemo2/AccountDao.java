package com.yuan.springdemo2;

public interface AccountDao {
    public void outMoney(String out, double money);
    public void inmoney(String in, double money);
}
