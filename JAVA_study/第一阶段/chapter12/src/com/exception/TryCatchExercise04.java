package com.exception;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = null;
        int num;
        do {
            try {
                System.out.println("请输入一个整数：");
                in = scanner.next();
                num = Integer.parseInt(in);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入不是整数：");
            }
        }while(true);
    }
}
