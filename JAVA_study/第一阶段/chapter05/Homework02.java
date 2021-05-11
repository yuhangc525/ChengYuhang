import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a number:");
		int num = in.nextInt();
		int a = num/100;
		int b = num/10%10;
		int c = num%10;
		// System.out.printf("%d%d%d",a,b,c);
		if (num == a*a*a+b*b*b+c*c*c){
			System.out.println("该数为水仙花数。");
		}else{
			System.out.println("不是水仙花数");
		
	}
		
		
}}