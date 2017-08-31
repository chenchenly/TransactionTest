package com.yuan.springdemo3;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:com/yuan/springdemo3/spring-config.xml")
public class SpringDome3 {
    /**
     * 声明式事务管理方式二：
     * 以Spring-AOP实现
     * 流程：在xml文件中配置事务的通知tx:advice，配置事务AOP切面。
     */
    //测试业务层
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void test() {
        accountService.transfer("aaa","bbb",200);
    }

}
