package generic;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/8
 * @describe:
 */

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        //限制存入类型
        ArrayList<Dog1> arrayList = new ArrayList<Dog1>();
        arrayList.add(new Dog1("jack",10));
        arrayList.add(new Dog1("tom",5));
        arrayList.add(new Dog1("david",9));
        for (Dog1 dog1 : arrayList) {
            //不需要向下转型
            System.out.println(dog1.getAge());
        }
    }
}
class Dog1{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}