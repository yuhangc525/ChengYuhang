package Set_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/5
 * @describe:
 */

public class HashSetStructure {
    public static void main(String[] args) {
        Node[] node = new Node[16];

        Node david = new Node("david", null);
        node[2] = david;
        Node jack = new Node("jack", null);
        david.next = jack;
    }
}

class Node{
    public String name;
    public Node next;

    public Node(String name, Node next) {
        this.name = name;
        this.next = next;
    }
}