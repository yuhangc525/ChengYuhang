package Array_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/22
 * @describe:
 */

import java.util.Arrays;

public class MathMEethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        int index = Arrays.binarySearch(arr,123);
        System.out.println(index);
        Integer[] arr1 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

    }
}
