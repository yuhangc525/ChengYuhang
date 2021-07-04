package list_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.awt.print.Book;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List col = new ArrayList();
        col.add(new Book1("三国演义","罗贯中",10));
        col.add(new Book1("小李飞刀","古龙",5));
        col.add(new Book1("红楼梦","曹雪芹",34));

        sort(col);
        for (Object o : col) {
            System.out.println(o);
        }

    }
    public static void sort(List list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                Book1 book1 = (Book1)list.get(i);
                Book1 book2 = (Book1)list.get(j);
                if(book1.getAge()>book2.getAge()){
                    list.set(j,book1);
                    list.set(i,book2);
                }

            }

        }

    }
}

class Book1{
    private String name;
    private String author;
    private int age;

    @Override
    public String toString() {
        return String.format("名称：%s\t\t价格：%d\t\t作者：%s",this.name,this.getAge(),this.author);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book1(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }
}