package com.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class  AAA{
    {
        System.out.println("AAA 的代码块");
    }
    public AAA(){
        System.out.println("AAA构造器被调用");
    }
}

class BBB extends AAA{
    {
        System.out.println("BBB普通代码块");
    }
    public BBB(){
        //1.super()
        //2.代码块
        System.out.println("BBB构造器被调用");
    }
}
