package com.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();

    }
}

class A{
    private  int n2 = getN2();
    static {
        System.out.println("A 静态代码块");
    }
    {
        System.out.println("普通代码块");
    }
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2被调用");
        return 200;
    }
}