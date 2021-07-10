package generic;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/9
 * @describe:
 */

public class Generic03 {
    public static void main(String[] args) {
        Person<String> hsp = new Person<>("hsp");
        System.out.println(hsp.f());
    }
}
class Person<E>{
    E s;
    public Person(E s){
        this.s = s;
    }
    public E f(){
        return s;
    }
}
