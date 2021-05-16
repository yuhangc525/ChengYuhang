package com.cheng.encap;

public class Encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("David");
        person.setAge(20);
        person.setSalary(30000);
        System.out.println(person.info());

        Person smith = new Person("smith", 500, 3000);
        System.out.println(smith.info());


    }

}

class Person {
    public String name;
    private int age;
    private double salary;

    //无属性构造器
    public Person() {
    }
    //三属性构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setAge(age);
        setName(name);
        setSalary(salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
    }else{
            System.out.println("名字长度不对，默认名字为无名");
            this.name = "无名";
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("你设置的年龄不对，需要在1-120，默认年龄18");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "name=" + name + " age=" + age + " salary=" + salary;
    }
}
