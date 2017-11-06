package com.lanou.sp.domain;

/**
 * Created by dllo on 17/11/3.
 */
public class Person {

    public Person() {
        System.out.println("Person的构造方法");
    }

    public void say(){
        System.out.println("生日快乐");
    }

    public void onCreate(){
        System.out.println("对象创建了");
    }
    public void onDestroy(){
        System.out.println("对象销毁了");
    }
}
