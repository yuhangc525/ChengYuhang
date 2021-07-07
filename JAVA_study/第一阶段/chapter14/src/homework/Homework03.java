package homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/7
 * @describe:
 */

import Set_.Hashmap_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        System.out.println(map);
        System.out.println("=======");
        map.put("jack",2600);
        Set set = map.keySet();
        for (Object o : set) {
            map.put(o,(Integer)map.get(o)+100);
        }
        Set set1 = map.entrySet();
        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
