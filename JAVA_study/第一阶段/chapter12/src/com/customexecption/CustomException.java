package com.customexecption;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if(!(age>=18&&age<=120)){
            //这里通过构造器，设置信息
            throw new AgeException("年龄在18~120之间");
        }
        System.out.println("你的年龄正常");
    }
}

class  AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}