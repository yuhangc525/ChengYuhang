package Map_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/6
 * @describe:
 */

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","hsp");
        map.put("no2","jack");
        map.put("no3","david");
        map.put("no4","tom");
        //1,取出所有的键
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o+"-"+map.get(o));
        }
        System.out.println("=========");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next + "-"+map.get(next));
        }
        //2只取值
        System.out.println("========");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
        }
        //3，使用entry
        Set set1 = map.entrySet();
        for (Object entry : set1) {
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()){
            Object next = iterator2.next();
            Map.Entry m1 = (Map.Entry)next;
            System.out.println(m1.getKey()+"-"+m1.getValue());
        }
    }
}
