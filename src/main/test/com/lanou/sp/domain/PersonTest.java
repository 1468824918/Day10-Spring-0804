package com.lanou.sp.domain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/3.
 */
public class PersonTest {

    @Test
    public void createTest(){
        //1.创建Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取容器中的对象
//        Person p = (Person) ctx.getBean("person");
//        p.say();


        /*
            根据断点调试可以验证:
            当Spring加载配置文件的时候就已经把配置文件中声明的所有对象都声明出来了,并把这些对象保存到Spring的容器中
            当调用getBean方法的时候,只是简单的将某个对象取出来
         */
        Person p2 = (Person) ctx.getBean("person2");
        Person p3 = (Person) ctx.getBean("person2");

        //通过打印两个对象可知,Spring容器创建的对象是单例的,多次通过同一个id取出来的对象是同一个
        System.out.println(p2);
        System.out.println(p3);

//        实例工厂
//        PersonGenerator generator = new PersonGenerator();
//        Person p4 = generator.generate();


        System.out.println("-----------");
        Person p4 = (Person) ctx.getBean("person4");
        p4.say();
        //关闭容器
        ((ClassPathXmlApplicationContext)ctx).close();

    }



}