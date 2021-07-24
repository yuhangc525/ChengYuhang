package properties;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:使用Properties读取properties文件
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //把k-v显示在控制台
        properties.list(System.out);
        //根据key获取对应的值
        String user = properties.getProperty("user");
        System.out.println("用户名="+user);
    }
}
