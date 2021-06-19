package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/18
 * @describe:
 */

public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Boat());
        person.common();
        person.passRiver();
        person.common();
        person.passRiver();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马走");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船走");
    }
}
class VehiclesFactory{
    private static Horse horse = new Horse();
    private VehiclesFactory(){}
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person {
    private String name;
    private Vehicles vehicles;
    public void passRiver(){
        if (!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
}