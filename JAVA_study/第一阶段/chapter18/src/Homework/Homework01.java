package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String dir = "e:\\maytemp";
        File file = new File(dir);
        if(!file.exists()){
            if (file.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        }

        String filePath = dir + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()){
            if (file.createNewFile()){
                System.out.println("file succeed");
            }else{
                System.out.println("file failed");
            }
        }else {
            System.out.println("文件已经存在");
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("hello,world!");
        bufferedWriter.close();
    }
}
