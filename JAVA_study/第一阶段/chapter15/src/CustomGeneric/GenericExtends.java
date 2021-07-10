package CustomGeneric;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/10
 * @describe:泛型的继承及通配符
 */

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<AA> list3 = new ArrayList<AA>();
        ArrayList<BB> list4 = new ArrayList<BB>();
        ArrayList<CC> list5 = new ArrayList<CC>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list3);
        printCollection3(list1);
    }
    //说明：list<?>表示任意的泛型类型都可以接受
    public static void printCollection1(List<?> c){
        for (Object object : c){//通配符，取出时，就是object
            System.out.println(object);
        }
    }
    //？ extends AA 表示上限，可以接受AA或者AA子类
    public static void printCollection2(List<? extends AA> c){
        for (Object object : c){
            System.out.println(object);
        }
    }
    //? super AA 支持AA类及AA类的父类，不限于直接父类
    //规定的下限
    public static void printCollection3(List<? super AA> c){
        for (Object object:c){
            System.out.println(object);
        }
    }
}

class AA{}
class BB extends AA{}
class CC extends BB{}