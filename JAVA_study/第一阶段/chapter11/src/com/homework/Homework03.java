package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/18
 * @describe:
 */

public class Homework03 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.shout();
        cat.shout();
    }
}

abstract class Animal{
    abstract void shout();
}
class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("猫会喵喵叫。");
    }
}
class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("狗会汪汪叫。");
    }
}