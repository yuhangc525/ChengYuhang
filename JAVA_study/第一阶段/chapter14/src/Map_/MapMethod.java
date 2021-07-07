package Map_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/6
 * @describe:
 */

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);
        map.put(1,2);
        map.put(2,3);
        map.remove(null);
        Object val = map.get(2);
        System.out.println("2="+val);
        int num = map.size();
        System.out.println("size="+num);
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(4));
        System.out.println(map);
    }
}
