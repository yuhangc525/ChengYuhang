package list_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.util.ArrayList;
import java.util.List;

public class Listmethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add(1,"程宇航");
        list.add("张三丰");
        System.out.println(list);
        //返回第一次出现的位置
        System.out.println(list.indexOf("张三丰"));
        //返回最后一次出现的位置
        System.out.println(list.lastIndexOf("张三丰"));
        //移除特定位置的元素
        list.remove(0);
        System.out.println(list);
        //替换特定位置的元素,必须要存在
        list.set(1,"tom");
        System.out.println(list);
        //sublist(a,b),返回从a到b的子集合,取不到b
        List ret = list.subList(0,2);
        System.out.println(ret);
    }
}
