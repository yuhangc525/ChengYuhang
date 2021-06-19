package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/18
 * @describe:考察匿名内部类的使用
 */

public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Calculate() {
            @Override
            public int work(int a, int b) {
                return a + b;
            }
        },10,8);
    }
}
interface Calculate{
    public int work(int a, int b);
    }

class CellPhone{
    public void testWork(Calculate calculate,int a ,int b){
        int result = calculate.work(a,b);
        System.out.println(result);
    }
}