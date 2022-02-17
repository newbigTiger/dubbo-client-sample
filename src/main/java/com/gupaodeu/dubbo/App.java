package com.gupaodeu.dubbo;

import com.gupaoedu.dubbo.server.ILoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 简单的将api包引入后做一个实现
 * 扫描配置文件，获取bean
 */
public class App 
{
    public static void main( String[] args )
    {
        ILoginService iLoginService = null;
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");
        iLoginService = applicationContext.getBean(ILoginService.class);
        System.out.println(iLoginService.login("admin","admin"));
    }
}
