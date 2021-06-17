package com.InnerClass;


public class LocalInnerClass {
    public static void main(String[] args) {

    }
}
class Outer02{//外部类
    private int n1 = 100;
    private void m2(){};
    public void m1(){//方法
        class Inner02{//局部内部类
            public void f1(){
                System.out.println("n1= "+n1);
            }
        }
    }
}