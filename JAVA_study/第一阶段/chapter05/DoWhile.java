import java.util.Scanner;
public class DoWhile{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char c;
		do{
			System.out.println("ÎåÁ¬±Þ");
			System.out.println("»¹Ç®Âð£¬y/n");
			c = in.next().charAt(0);


		}while(c != 'y');
}}