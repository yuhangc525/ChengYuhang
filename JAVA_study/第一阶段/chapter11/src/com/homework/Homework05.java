package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/18
 * @describe:内部类考察
 */

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();

    }
}

class A{
    private String name = "hello";
    public void f1(){
        class B{
            private final String NAME = "10086";
            public void show(){
                System.out.println(A.this.name+ NAME);
            }

        }
        B b = new B();
        b.show();
    }
}
