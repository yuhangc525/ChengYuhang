package com.throws_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class ThrowsDetails01 {
    public static void main(String[] args) {
        f2();

    }
public static void f2() throws ArithmeticException{
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
}
class Father{
        public void method() throws RuntimeException{

        }
}
class Son extends Father{
        @Override
        public void method() throws NullPointerException{

        }
}
}
