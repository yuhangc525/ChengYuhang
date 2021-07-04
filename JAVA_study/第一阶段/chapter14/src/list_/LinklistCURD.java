package list_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:
 */

import java.util.LinkedList;

@SuppressWarnings({"all"})
public class LinklistCURD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add('l');
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("linkedlist="+linkedList);
        System.out.println("==========");
        linkedList.remove();//删除一个节点，默认第一个
        System.out.println(linkedList);
        //set修改节点
        linkedList.set(1,2);
        System.out.println(linkedList);
        //get得到某个节点
        System.out.println(linkedList.get(1));
        //遍历可用迭代器、增强for、常规for
    }
}
