package OutputStream;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/18
 * @describe:
 演示将数据写到文件中，如果该文件不存在，则创建文件
 */


import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        //创建FileOutputStream对象
        String filepath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到fileOutputStream对象
            //创建时直接覆盖
            fileOutputStream = new FileOutputStream(filepath,true);

            //写入一个字符串
            String str = "hello,world";
            try {
                //写入一个字节
                //fileOutputStream.write('H');
                //string.getbytes() 可以将字符串转成字符数组
                //fileOutputStream.write(str.getBytes());
                fileOutputStream.write(str.getBytes(),0,str.length());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //关闭输出流
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
