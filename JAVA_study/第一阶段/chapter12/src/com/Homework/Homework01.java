package com.Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1,n2);
            System.out.println("计算结果"+ res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("参数格式不对，需要输出整数");
        }catch (ArithmeticException e){
            System.out.println("出现了除0的异常");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double cal(int n1, int n2) throws Exception {
        return n1 / n2;
    }
}
