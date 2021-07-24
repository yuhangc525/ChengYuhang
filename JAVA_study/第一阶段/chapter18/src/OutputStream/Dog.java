package OutputStream;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:
 */

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    //序列化对象时，默认将里边所有属性进行序列化，但是除了static或transient
    //序列化时的版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
