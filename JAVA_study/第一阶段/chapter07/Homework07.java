public class Homework07{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.name = "dahuang";
		dog.color = "red";
		dog.age = 5;
		dog.show();
}}
class Dog{
	String name;
	String color;
	int age;
	public void show(){
		System.out.println(name+"\t"+color+"\t"+age);
	}
}