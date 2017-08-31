package com.yuan.springdemo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {




    @Override
    public void outMoney(String out, double money) {
        String sql = "update account set money = money-? where name=?";
        this.getJdbcTemplate().update(sql, new Object[]{money,out});
    }

    @Override
    public void inmoney(String in, double money) {
        String sql = "update account set money = money+? where name=?";
        this.getJdbcTemplate().update(sql,new Object[]{money,in});
    }
}
