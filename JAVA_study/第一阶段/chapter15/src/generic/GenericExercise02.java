package generic;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/9
 * @describe:
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new Mydate(1999,10,21)));
        employees.add(new Employee("jack",50000,new Mydate(2000,12,10)));
        employees.add(new Employee("david",70000,new Mydate(1888,5,24)));
        System.out.println("employee="+employees);
        System.out.println("=======");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee &&o2 instanceof Employee))
                {
                    System.out.println("类型不正确");
                    return 0;
                }
                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0){
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private int sal;
    private Mydate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}
class Mydate{
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public int compareTo(Mydate o){
        int yearMinus = year - o.getYear();
        if(yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0){
            return monthMinus;
        }
        int dayMinus = day - o.getDay();
        return dayMinus;

    }
}
