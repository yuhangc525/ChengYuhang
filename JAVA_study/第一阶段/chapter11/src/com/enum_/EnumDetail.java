package com.enum_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/15
 * @describe:枚举细节,枚举实现实现接口，不能继承类
 */

public class EnumDetail {
    public static void main(String[] args) {
        Music.classic.playing();

    }
}
interface Iplaying{
    void playing();
}

enum Music implements Iplaying{
    classic;
    @Override
    public void playing() {
        System.out.println("playing music");
    }
}