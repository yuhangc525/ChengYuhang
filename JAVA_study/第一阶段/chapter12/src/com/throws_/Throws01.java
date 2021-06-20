package com.throws_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:throws入门
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {
    }
    public void f1() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
