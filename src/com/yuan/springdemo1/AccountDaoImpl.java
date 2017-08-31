package com.yuan.springdemo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
