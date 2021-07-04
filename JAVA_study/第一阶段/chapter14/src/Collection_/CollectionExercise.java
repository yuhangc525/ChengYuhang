package Collection_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("jack",5));
        list.add(new Dog("tank",6));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object net = iterator.next();
            System.out.println(net);
        }
        System.out.println("=======");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
