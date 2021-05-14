public class Constructor01{
	public static void main(String[] args){
		Person p1 = new Person("smith",80);
		System.out.println(p1.name+p1.age);
}}
class Person{
	String name;
	int age;
	public Person(String pName,int pAge){
		System.out.println("Succeed");
		name = pName;
		age = pAge;
	}
}