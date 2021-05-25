package com.cheng.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack);

    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}