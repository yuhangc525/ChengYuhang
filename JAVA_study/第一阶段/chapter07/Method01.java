import java.util.Scanner;
public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();
		p1.cal01(5);
		p1.cal01(10);
		int a = p1.getNum(10,20);
		System.out.println(a);
}}
class Person{
	String name;
	int age;
	public void speak(){
		System.out.println("我是一个好人");
	}
	public void cal01(int n){
		int sum = 0;
		for (int i = 1;i<=n;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	public int getNum(int num1,int num2){
		int res = num1+num2;
		return res;
	}
}