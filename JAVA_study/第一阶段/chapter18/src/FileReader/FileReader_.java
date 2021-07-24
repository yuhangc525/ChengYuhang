package FileReader;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:
 */

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings({"all"})
public class FileReader_ {
    public static void main(String[] args) throws IOException {


    }

    @Test
    //单个字符读取文件
    public void readFile01() throws IOException {
        //1.创建FileReader对象
        String filePath = "F:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read，单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
@Test
    public void readFile02() {
        String filePath = "F:\\story.txt";
        FileReader fileReader = null;
        char[] buf = new char[8];
        int readlen = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((readlen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readlen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
