package properties;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //创建，该文件没有key，就是创建，如果存在，就是修改
        properties.setProperty("charset","utf8");
        properties.setProperty("user","唐");
        properties.setProperty("pwd","8888");
        //储存到文件
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);//后边是注释
        System.out.println("保存成功");
    }
}
