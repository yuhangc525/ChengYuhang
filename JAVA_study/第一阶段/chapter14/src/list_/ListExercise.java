package list_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println(list);
        list.add(1,"hsp");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"tom");
        System.out.println("===========");
        System.out.println(list);
    }
}
