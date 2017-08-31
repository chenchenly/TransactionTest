package com.yuan.springdemo2;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:com/yuan/springdemo2/spring-config.xml")
public class SpringDome2 {
    /**
     * 声明式事务管理方式一：TransactionProxyBeanFactory
     * 缺点：每一个包含事务的类都需要创建一个代理类，当管理的事务的类过多时，配置文件中将包含大量的代理类的Bean
     * 流程：配置事务管理器；创建代理类，设置属性；使用代理类注入。
     */
    //测试业务层

    //@Resource(name="accountService")
    @Resource(name = "accountServiceProxy")//使用代理类注入
    private AccountService accountService;
    @Test
    public void test() {
        accountService.transfer("aaa","bbb",200);
    }

}
