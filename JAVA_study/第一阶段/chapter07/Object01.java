import java.util.Scanner;
public class Object01{
	public static void main(String[] args){
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 5;
		cat1.color = "��ɫ";
		
		System.out.println(cat1.name + cat1.age + cat1.color);
}}

class Cat{
	String name;
	int age;
	String color;
}