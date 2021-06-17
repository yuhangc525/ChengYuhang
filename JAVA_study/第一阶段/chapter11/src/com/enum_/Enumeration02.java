package com.enum_;/*
 * @author 程宇航
 * @version 1.0
 * @date 2021/6/15
 * @describe: 使用ensum关键字来实现枚举
 */

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);

    }
}
enum Season2{
    //要放在最前面，当有多个对象时，使用，分隔
    SPRING("spring","warm"),SUMMER("summer","hot"),
    AUTUMN("autumn","cool"),WINTER("winter","cold");
    private String name;
    private String desc;

    //在内部创建固定对象
//    public static final Season SPRING = new Season("spring","warm");
//    public static final Season SUMMER = new Season("summer","hot");
//    public static final Season AUTUMN = new Season("autumn","cool");
//    public static final Season WINTER = new Season("winter","cold");

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}