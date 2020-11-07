package com.test;

import com.atguigu.spring.bean.Person;
import com.atguigu.spring.di.UserServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author darren
 * @create 2020-11-01 21:19
 */
public class TestBean {

    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        Person person1 = (Person)context.getBean("person1");
        Person person2 = context.getBean("person2",Person.class);
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    public void testBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        UserServlet bean = context.getBean(UserServlet.class);
        bean.helloServlet();
    }
}
