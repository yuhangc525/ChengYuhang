import java.util.Scanner;
public class Object01{
	public static void main(String[] args){
		Cat cat1 = new Cat();
		cat1.name = "Ð¡°×";
		cat1.age = 5;
		cat1.color = "°×É«";
		
		System.out.println(cat1.name + cat1.age + cat1.color);
}}

class Cat{
	String name;
	int age;
	String color;
}