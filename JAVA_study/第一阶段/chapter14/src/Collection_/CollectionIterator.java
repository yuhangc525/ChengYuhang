package Collection_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));

        //遍历集合
        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
//        while (iterator.hasNext()){
//            //返回下一个元素，类型是object
//            Object obj = iterator.next();
//            System.out.println(obj);
//        }
        //快捷键itit，ctrl+j查看所有
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        iterator = col.iterator();//重置迭代器
        //增强for循环也可以，快捷键I/col.for
        System.out.println("==========");
        for (Object book:col){
            System.out.println(book);
        }

        }
    }
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}