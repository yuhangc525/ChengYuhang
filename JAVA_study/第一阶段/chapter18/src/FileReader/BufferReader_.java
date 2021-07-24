package FileReader;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:演示buffferreader使用
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings({"all"})
public class BufferReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:\\story.txt";
        //创建bufferReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;
        //readline()按行读取
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
