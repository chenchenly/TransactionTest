package com.yuan.springdemo3;

public interface AccountDao {
    public void outMoney(String out, double money);
    public void inmoney(String in, double money);
}
