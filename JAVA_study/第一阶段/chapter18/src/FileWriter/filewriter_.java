package FileWriter;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:
 */

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void fileWriter01(){
        String filePath = "F:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath,true);
            //write(int) 写入单个字符
            //fileWriter.write('H');
            //fileWriter.write("\n");
            //write(char[]) 写入指定数组
            //fileWriter.write(chars);
            //write(char[],off,len)写入指定数组的指定部分
            //fileWriter.write("程宇航好好学java".toCharArray(),1,5);
            //write(string)写入字符串
            //fileWriter.write("\nhello,world\n");
            fileWriter.write("\nhello,world");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于filewriter，一定要关闭流或者flush才能写入
            try {
                if (fileWriter != null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("程序结束");
        }

    }
}
