package com.cheng.poly_;


public class PloyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();//输出结果看运行类型
        animal = new Cat();
        animal.cry();
    }
}
