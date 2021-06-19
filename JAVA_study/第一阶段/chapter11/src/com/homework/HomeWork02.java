package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/18
 * @describe:第十章家庭作业第二题
 */

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println("First:"+Frock.getNextNum());
        System.out.println("Second:"+Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
class Frock{
    public static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

}
