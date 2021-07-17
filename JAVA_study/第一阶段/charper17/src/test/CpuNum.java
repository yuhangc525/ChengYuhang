package test;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/15
 * @describe:
 */

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNum = runtime.availableProcessors();
        System.out.println("当前有CPU个数："+cpuNum);
    }
}
