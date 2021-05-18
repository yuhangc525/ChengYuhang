package com.cheng.override_.exercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack.say());

        Student smith = new Student("smith", 10, 201720, 99.9);
        System.out.println(smith.say());

    }
//    new Student("smith",12,45,99.9);
}
