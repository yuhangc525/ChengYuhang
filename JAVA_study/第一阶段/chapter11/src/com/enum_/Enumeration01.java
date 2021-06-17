package com.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}

class Season{
    private String name;
    private String desc;

    //在内部创建固定对象
    public static final Season SPRING = new Season("spring","warm");
    public static final Season SUMMER = new Season("summer","hot");
    public static final Season AUTUMN = new Season("autumn","cool");
    public static final Season WINTER = new Season("winter","cold");

    private Season(String name, String desc) {
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