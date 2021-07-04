package Collection_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("=========");
        System.out.println(list);
        //删除元素
        list.remove(0);//删除第一个元素
        list.remove("jack");//删除指定元素
        System.out.println("======");
        System.out.println(list);
        //contains 查找指定元素是否存在
        System.out.println(list.contains(true));
        //size 获取元素个数
        System.out.println(list.size());
        //clear 清空
        list.clear();
        System.out.println("=====");
        System.out.println(list);
        //addAll 添加多个元素
        List list2 =new ArrayList();
        list2.add("sjfio");
        list2.add("safhiu");
        System.out.println(list.addAll(list2));
        System.out.println(list);
        //removeAll 删除多个元素


    }
}
