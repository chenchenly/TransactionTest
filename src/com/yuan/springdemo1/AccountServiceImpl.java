package com.yuan.springdemo1;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

public class AccountServiceImpl implements   AccountService {

    private AccountDao accountDao;

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out ,String in, double money){
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                accountDao.outMoney(out,money);
//        int a = 1/0;
//                accountDao.inmoney(in,money);
//            }
//        });
        transactionTemplate.execute((transactionStatus)->{
            accountDao.outMoney(out,money);
//           int a = 1/0;
            accountDao.inmoney(in,money);
            System.out.println(transactionStatus);
            System.out.println(transactionStatus.hasSavepoint());
            System.out.println(transactionStatus.isCompleted());
            System.out.println(transactionStatus.isNewTransaction());
            System.out.println(transactionStatus.isRollbackOnly());

            return transactionStatus;
        });

    }
}
