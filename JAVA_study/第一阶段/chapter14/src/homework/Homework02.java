package homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/7
 * @describe:
 */

import java.util.ArrayList;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Car jack = new Car("jack", 100000);
        Car david = new Car("david", 2000);
        list.add(jack);
        list.add(david);
//        list.remove(david);
//        list.clear();
        System.out.println(list.contains(jack));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.addAll(list);
        list.remove(david);
//        list.removeAll(list);
        System.out.println(list);

    }
}
class Car{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
