package Collections_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/7
 * @describe:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("david");
        list.add("milan");
        //反转元素顺序
//        Collections.reverse(list);
        //shuffle(list) 随机排序
//        Collections.shuffle(list);
        //sort 对元素自然顺序进行排序
//        Collections.sort(list);
        //自定义排序顺序
//        Collections.sort(list, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String)o1).length()-((String)o2).length();
//            }
//        });
        //交换顺序,可自定义
//        Collections.swap(list,0,1);
//        System.out.println("自然顺序最大值："+Collections.max(list));
        System.out.println("tom:"+Collections.frequency(list,"tom"));
//        ArrayList arr = new ArrayList();
//        for (int i = 0; i < list.size(); i++) {
//            arr.add(i);
//        }
//        Collections.copy(arr,list);
//        System.out.println(arr);
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);

    }
}
