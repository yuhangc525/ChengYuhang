package OutputStream;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:演示ObjectOutputStream的使用，完成数据的序列化
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "f:\\data.dat";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeInt(100);
            oos.writeBoolean(true);
            oos.writeChar('a');
            oos.writeUTF("程宇航好好学java");
            oos.writeDouble(9.5);
            oos.writeObject(new Dog("david"));
            System.out.println("successful");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
//如果需要序列化某个类的对象，需要实现如下接口

