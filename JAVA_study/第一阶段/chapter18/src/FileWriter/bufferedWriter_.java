package FileWriter;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:\\note.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello,world!");
        bufferedWriter.newLine();//插入一个换行符
        bufferedWriter.write("hello,world！");
        bufferedWriter.write("hello,world!");
        //插入一个换行

        bufferedWriter.close();
    }
}
