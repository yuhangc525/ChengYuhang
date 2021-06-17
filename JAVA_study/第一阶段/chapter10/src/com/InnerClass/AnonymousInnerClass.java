package com.InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1 = 10;
    public void method(){//方法
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤。。。");
            }
        };
        tiger.cry();
        Father father = new Father("jack"){
            @Override
            public void hi() {
                System.out.println("匿名对象重写方法");
            }
        };
        father.hi();
    }
}

interface IA{
    public void cry();
}

class Father{
    private String name;
    public Father(String name) {
        this.name = name;
    }
    public void hi(){
        System.out.println("父类调用");
    }
}