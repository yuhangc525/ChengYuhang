package com.exception;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/19
 * @describe:异常知识引入，try-catch-finally
 */

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
//        int res = num1 /num2;
//        使用try-catch捕获异常
        try {
            int res = num1 /num2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {//一定会执行
            System.out.println("Who are you?");
        }

        System.out.println("");
    }
}
