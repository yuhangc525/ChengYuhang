package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:
 */

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        String datPath = "src\\homework\\dog.dat";
        String filepath = "src\\homework\\dog.properties";
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");
        properties.store(new FileOutputStream(filepath),null);

        Properties pr = new Properties();
        pr.load(new FileInputStream(filepath));
        String name = pr.getProperty("name");
        int age = Integer.parseInt(pr.getProperty("age"));
        String color = pr.getProperty("color");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(datPath));
        oos.writeObject(new Dog(name,age,color));
        oos.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
