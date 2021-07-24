package FileInput;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:反序列化
 */

import OutputStream.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) {
        //指定反序列化文件
        String filePath = "f:\\data.dat";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            //反序列化顺序需要和保存数据的顺序一致
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readChar());
            System.out.println(ois.readUTF());
            System.out.println(ois.readDouble());
            Object dog = ois.readObject();
            Dog dog1 = (Dog) dog;
            System.out.println(dog1);
//            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
