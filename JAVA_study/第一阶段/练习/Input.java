import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please input your name:");
		String name = myScanner.next();
		System.out.println("Please input your age:");
		int age = myScanner.nextInt();
		System.out.println("Please input your salary:");
		double salary = myScanner.nextDouble();
		System.out.printf("name:%s\nage:%d\nsalary:%.2f",name,age,salary);
		
	}
}