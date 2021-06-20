package com.exception;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class NullPointerException extends Throwable {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
