package com.test;

import com.atguigu.spring.bean.Person;
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
        Person person = (Person)context.getBean("person");
        System.out.println(person);
    }
}
