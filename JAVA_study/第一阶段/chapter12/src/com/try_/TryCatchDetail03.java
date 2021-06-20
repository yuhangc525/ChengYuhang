package com.try_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class TryCatchDetail03 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } finally {
            System.out.println("执行了finally");
        }
        System.out.println("程序继续执行。。");
    }
}
