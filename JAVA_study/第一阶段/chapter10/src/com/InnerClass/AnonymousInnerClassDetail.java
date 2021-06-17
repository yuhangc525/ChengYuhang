package com.InnerClass;

import org.w3c.dom.ls.LSOutput;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1 = 99;
    public void f1(){
        Person p = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi（）");
            }
        };
        p.hi();
        new Person(){
            @Override
            public void hi() {
                System.out.println("twice");
            }
        }.hi();
    }
}
class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
}