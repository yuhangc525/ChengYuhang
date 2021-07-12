package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/10
 * @describe:
 */

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,11,"tom"));
        dao.save("003",new User(3,12,"david"));
        List<User> list = dao.list();
        System.out.println("list="+list);
    }
}
class DAO<T>{
    Map<String,T> map = new HashMap<>();
    @Test
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entry){
        map.put(id,entry);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<String> strings = map.keySet();
        for (String string : strings) {
            list.add(get(string));
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
