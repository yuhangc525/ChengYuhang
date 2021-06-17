package com.enum_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/15
 * @describe:作业
 */

public class EnumExercise02 {
    public static void main(String[] args) {
        System.out.println("==所有星期信息如下==");
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),
    WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
