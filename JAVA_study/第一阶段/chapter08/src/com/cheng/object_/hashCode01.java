package com.cheng.object_;

public class hashCode01 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2 = a;
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
class A{}
