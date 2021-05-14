public class This01{
	public static void main(String[] args){
		
		Person p2 = new Person("cheng",22);
		System.out.println(p2.name + p2.age);
}}
class Person{
	String name;
	int age;

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}