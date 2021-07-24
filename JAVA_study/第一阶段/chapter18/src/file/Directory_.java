package file;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/17
 * @describe:常用的文件操作
 */

import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;

public class Directory_ {
    public static void main(String[] args) {
        //
    }
    //判断文件是否存在，如果存在就删除
    @Test
    public void m1(){
        String file = "E:\\news1.txt";
        File file1 = new File(file);
        if(file1.exists()){
            if(file1.delete()){
                System.out.println(file+"删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该文件不存在");
        }
    }
    //判断F:\\demo2是否存在，存在就删除，否则提示不存在
    //在java编程中，目录也被当成文件
    @Test
    public void m2(){
        String filepath = "F:\\demo";
        File file = new File(filepath);
        if(file.exists()){
            if(file.delete()){
                System.out.println(file+"删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该文件不存在");
        }
    }
    @Test
    public void m3(){
        String filepath = "F:\\demo\\a\\b";
        File file = new File(filepath);
        if(file.exists()){
            System.out.println("该目录已经存在");
        }else{
            if (file.mkdirs()){
                System.out.println(filepath+"创建成功");
            }else{
                System.out.println(filepath+"创建失败");
            }
        }
    }
}