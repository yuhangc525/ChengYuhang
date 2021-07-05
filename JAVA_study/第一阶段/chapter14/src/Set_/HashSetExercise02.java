package Set_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/5
 * @describe:
 */

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee1("tom",2000,"2000-10-10"));
        hashSet.add(new Employee1("tom",2000,"2000-10-10"));
        System.out.println(hashSet);
    }
}
class Employee1{
    private String name;
    private double sal;
    private String data;

    public Employee1(String name, double sal, String data) {
        this.name = name;
        this.sal = sal;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(data, employee1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, data);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", data='" + data + '\'' +
                '}';
    }
}