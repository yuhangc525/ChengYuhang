package Map_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/6
 * @describe:
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Emp("jack",30000,1));
        map.put(2,new Emp("david",3000,2));
        map.put(3,new Emp("tom",18002,3));

        Set set = map.keySet();
        for (Object key : set) {
            Emp m = (Emp) map.get(key);
            if (m.getSal()>18000){
                System.out.println(m);
            }
        }
        System.out.println("=========");
        Set set1 = map.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            Emp m = (Emp)entry.getValue();
            if (m.getSal()>18000){
                System.out.println(m);
            }
        }
    }
}
class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
