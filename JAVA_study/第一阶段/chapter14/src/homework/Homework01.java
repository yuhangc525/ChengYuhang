package homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/7
 * @describe:
 */

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新冠确诊病例超千万，数百万印度信徒赴恒河“圣浴”引民众担忧"));
        list.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));

        int size = list.size();
        for (int i = size-1; i >= 0; i--) {
//            System.out.println(list.get(i));
            News news = (News) list.get(i);
            System.out.println(dealTitle(news.getTitle()));
        }
    }
    public static String dealTitle(String title){
        if(title == null){
            return "";
        }
        if(title.length()>15){
            return title.substring(0,15)+"...";
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String words;

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
