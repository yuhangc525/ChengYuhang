package list_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //list接口有序（添加顺序与取出顺序一致，且空重复）
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("jack");
        System.out.println(arrayList);
    }
}
