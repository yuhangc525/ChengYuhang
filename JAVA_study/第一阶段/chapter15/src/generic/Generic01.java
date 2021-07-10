package generic;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/8
 * @describe:
 */

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("jack",10));
        arrayList.add(new Dog("tom",5));
        arrayList.add(new Dog("david",9));

        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName()+dog.getAge());
        }
    }
}
class Dog{
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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
