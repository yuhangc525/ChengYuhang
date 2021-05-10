import java.util.Scanner;
public class Switch01{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	char c1 = in.next().charAt(0);
	switch(c1){
		case 'a':
			System.out.println("猴子穿新衣");
			break;
		case 'b':
			System.out.println("猴子爬雪山");
			break;
		default:
			System.out.println("输入不正确");
			break;
	}
	System.out.println("已退出switch语句");
}}