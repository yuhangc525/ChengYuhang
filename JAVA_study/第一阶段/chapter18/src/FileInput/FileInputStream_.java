package FileInput;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/18
 * @describe:演示fileinputstream的使用,
 单个字节读取，效率较低
 *使用read（byte【】）读取，提高效率
 */

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings({"all"})
public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "e:\\hello.txt";
        int readData = 0;//储存读取的数据
        //创建fileinputstream对象，用于读取文件
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //返回-1，表示读取完毕
            while ((readData = fileInputStream.read())!=-1){
                System.out.print((char) readData);//显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止

    }
    //使用read(byte[] )来提高效率
    @Test
    public void readFile02(){
        String filePath = "e:\\hello.txt";
        int readLen = 0;
        byte[] buf = new byte[8];
        //创建fileinputstream对象，用于读取文件
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如果读取正常，返回实际读取的字节数
            //返回-1，表示读取完毕
            while ((readLen = fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));//显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止

    }
}
