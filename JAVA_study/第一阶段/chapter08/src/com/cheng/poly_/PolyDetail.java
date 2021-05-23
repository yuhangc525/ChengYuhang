package com.cheng.poly_;

public class PolyDetail {
    public static void main(String[] args) {
        BB bb  =  new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true
        Object obj = new Object();
        System.out.println(obj instanceof AA);//fals
        String str = "Hello";
        System.out.println(str instanceof Object);//true
    }
}

class AA{}
class BB extends AA{}