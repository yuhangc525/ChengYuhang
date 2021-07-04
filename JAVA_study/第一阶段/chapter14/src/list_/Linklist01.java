package list_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:模拟一个双向链表
 */

public class Linklist01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");
        //连接三个节点，形成双向链表
        jack.next = tom;
        tom.next = hsp;
        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;//让first指向jack，就是双向链表的头结点
        Node last = hsp;

       while (true){
           if(first == null){
               break;
           }
           System.out.println(first);
           first = first.next;
       }
       Node smith = new Node("smith");
       smith.pre = tom;
       tom.next = smith;
       smith.next = hsp;
       hsp.pre = smith;
       first = jack;//让first指向jack，就是双向链表的头结点Node last = hsp;
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}
class Node{
    public Object item;//真正存放数据
    public Node next;//后一个节点
    public Node pre;//前一个节点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return  "Node name =" + item;
    }
}
