package Map_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/7
 * @describe:
 */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String) o1);
            }
        });

        map.put("jack",1);
        map.put("tom",2);
        map.put("smith",3);
        map.put("david",4);
        map.put("abire",5);
        System.out.println(map);
    }
}
