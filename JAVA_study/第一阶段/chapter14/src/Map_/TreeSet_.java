package Map_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/7
 * @describe:
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("david");
        System.out.println(treeSet);
    }
}
