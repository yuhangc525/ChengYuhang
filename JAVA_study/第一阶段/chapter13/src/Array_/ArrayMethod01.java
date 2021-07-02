package Array_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/22
 * @describe:
 */

import java.util.Arrays;

public class ArrayMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
        System.out.println(Arrays.toString(integers));
        Integer[] integer1 = {-1,2,1,9,5};
        Arrays.sort(integer1);
        System.out.println(Arrays.toString(integer1));
//        Arrays.sort(integer1, new Comparator() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//
//            }
//        });
    }
}
