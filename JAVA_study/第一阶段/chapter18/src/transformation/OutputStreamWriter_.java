package transformation;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:使用OutputStreamWriter按特定类型保存文件
 */

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) {
        String filePath = "f:\\test10.txt";
        String charSet = "utf8";
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
            osw.write("What are you doing?，程宇航");
            System.out.println("保存文件成功");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
