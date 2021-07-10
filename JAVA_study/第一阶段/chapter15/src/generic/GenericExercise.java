package generic;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/9
 * @describe:
 */

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        Student jack = new Student("jack", 10);
        Student tom = new Student("tom", 11);
        Student david = new Student("david", 12);
        HashSet<Student> students = new HashSet<>();
        students.add(jack);
        students.add(tom);
        students.add(david);
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("============");
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put(jack.getName(),jack);
        stringStudentHashMap.put(tom.getName(),tom);
        stringStudentHashMap.put(david.getName(),david);
        Set<String> strings = stringStudentHashMap.keySet();
        for (String string : strings) {
            System.out.println(stringStudentHashMap.get(string));
        }
        System.out.println("==========");
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.toString());
        }
        System.out.println("=========");
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+" "+next.getValue());
        }

    }
}
class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
