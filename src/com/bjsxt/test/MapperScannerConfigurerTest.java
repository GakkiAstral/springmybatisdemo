package com.bjsxt.test;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MapperScannerConfigurerTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        /*String[] beanDefinitionNames =applicationContext.getBeanDefinitionNames();
        for (String str : beanDefinitionNames){
            System.out.println(str);
        }*/
        UsersService usersService = (UsersService) applicationContext.getBean("usersService3");
        List<Users> list = usersService.findUsersAll();
        list.forEach(System.out::println);
    }
}
