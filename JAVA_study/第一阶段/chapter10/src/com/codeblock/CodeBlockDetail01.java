package com.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        AA aa = new AA();
//        AA aa2  = new AA();
        System.out.println(Cat.n1);
    }
}


class Cat{
    public static  int n1 = 999;
    static {
        System.out.println("cat的代码块");
    }
}
class BB{
    static {
        System.out.println("BB的代码块");
    }
}
class AA extends BB{
    static {
        System.out.println("AA的代码块");
    }
}