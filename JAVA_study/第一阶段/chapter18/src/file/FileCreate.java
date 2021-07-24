package file;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/17
 * @describe:
 */

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1
    @Test
    public void create01(){
        String filepath = "e:\\news1.txt";
        File file = new File(filepath);//这里file只是java的一个对象
        try {
            //真正创建文件
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create02(){
        File parentFile = new File("e:\\");
        String filename = "news2.txt";
        File file = new File(parentFile,filename);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create03(){
        String parentPath = "e:\\";
        String filename = "new3.txt";
        File file = new File(parentPath,filename);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

