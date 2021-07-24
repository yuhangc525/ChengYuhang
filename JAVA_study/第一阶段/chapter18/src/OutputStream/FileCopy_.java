package OutputStream;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/18
 * @describe:文件拷贝
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_ {
    public static void main(String[] args) {
        //完成文件拷贝
        //创建文件的输入流，
        //创建文件的输出流
        //在完成程序时，应该是读取部分数据就写入到文件中
        String srcFilepath = "F:\\照片电子版.jpg";
        String filepath = "e:\\程宇航.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFilepath);
            fileOutputStream = new FileOutputStream(filepath);
            //定义一个字节数组
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf))!= -1){
                //读取到后，就写入文件
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("完成拷贝");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
