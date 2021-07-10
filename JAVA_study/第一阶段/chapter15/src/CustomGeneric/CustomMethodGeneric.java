package CustomGeneric;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/10
 * @describe:
 */

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("保安",100);
    }
}
class Car{
    public void run(){//普通方法

    }
    public<T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
class Fish<T,R>{
    public void run(){//普通方法
         }
     public<U,M> void eat(U u,M m){
        //泛型方法
     }
}
