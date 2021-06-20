package com.try_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "cyh";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("程序继续");
        }
    }
}
