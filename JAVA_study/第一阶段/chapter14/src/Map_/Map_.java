package Map_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/6
 * @describe:
 */

import Set_.Hashmap_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","hsp");
        map.put("no2","jack");
        System.out.println(map.get("no1"));

        System.out.println(map);
    }
}
