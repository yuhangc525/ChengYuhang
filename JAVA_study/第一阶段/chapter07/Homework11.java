public class Homework11{
	public static void main(String[] args){
		
}}
class Employee{
	String name;
	char gender;
	int age;
	String loc;
	double salary;
	public  Employee(String name,char gender,String loc,double salary){
		this.name = name;
		this.gender = gender;
		this.loc = loc;
		this.salary = salary;
	}
	public  Employee(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String loc,double salary){
		this.loc = loc;
		this.salary = salary;
	}
}