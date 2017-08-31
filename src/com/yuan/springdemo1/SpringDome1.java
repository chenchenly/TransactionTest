package com.yuan.springdemo1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:com/yuan/springdemo1/spring-config.xml")
public class SpringDome1{
    /**
     * 声明式事务管理方式二
     *
     */
    //测试业务层

    @Resource(name="accountService")
    private AccountService accountService;
    @Test
    public void test() {
        accountService.transfer("aaa","bbb",200);
    }

}
