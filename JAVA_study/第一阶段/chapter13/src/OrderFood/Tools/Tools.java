package OrderFood.Tools;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:
 */

import java.util.Arrays;
import java.util.Scanner;

public class Tools {
    static Scanner scanner = new Scanner(System.in);
    //接受一个整数
    public static int getChoice(int n) {
        do {
            try {
                String str_choice = scanner.next();
                int choice = Integer.parseInt(str_choice);
                if (choice >= 1 && choice <= n) {
                    return choice;
                }
                System.out.println("暂无该菜品");
            } catch (Exception e) {
                System.out.println("输入错误");
            }
        } while (true);
    }

    public static int getNum(){
        int num;
        do {
                num = scanner.nextInt();
                if (num >= 1) {
                    return num;
                }
                System.out.println("至少点一份（斤）");
            }
        while (true);
    }

    public static double getDouble(){
        double sale;
        do {
            sale = scanner.nextDouble();
            if (sale > 0 ) {
                return sale;
            }
            System.out.println("打折力度应大于0");
        }
        while (true);
    }
    public static String getString(){
        String str;
        do{
            str = scanner.next();
            return str;
        }while (true);
    }
    //对传入的数组排序，返回包含顺序的数组
    //1为正序排列，2为倒序排列
    public static int[] line(double[] nums){
        int n = nums.length;
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = i;
        }
        double[] s_num = Arrays.copyOf(nums,n);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (s_num[i]<s_num[j]){
                    double temp1 = s_num[i];
                    s_num[i] = s_num[j];
                    s_num[j] = temp1;
                    int temp2 = sequence[i];
                    sequence[i] = sequence[j];
                    sequence[j] = temp2;
                }
            }
        }
        return sequence;
    }

    public static int[] line(int[] nums) {
        int n = nums.length;
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = i;
        }
        int[] s_num = Arrays.copyOf(nums,n);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (s_num[i]<s_num[j]){
                    int temp1 = s_num[i];
                    s_num[i] = s_num[j];
                    s_num[j] = temp1;
                    int temp2 = sequence[i];
                    sequence[i] = sequence[j];
                    sequence[j] = temp2;
                }
            }
        }
        return sequence;
    }
}
