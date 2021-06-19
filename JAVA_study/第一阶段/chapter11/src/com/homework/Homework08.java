package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/19
 * @describe:枚举练习
 */

public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.green;
        green.show();
        switch (green){
            case red:
                System.out.println("红色");
                break;
            case blue:
                System.out.println("蓝色");
                break;
            case green:
                System.out.println("绿色");
                break;
        }
    }
}

enum Color implements Show{
    red(255,0,0),blue(0,0,255),black(0,0,0),
    yellow(255,255,0),green(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值"+redValue+","+greenValue+","+blueValue);
    }
}

interface Show{
    void show();
}