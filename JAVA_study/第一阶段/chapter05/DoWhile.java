import java.util.Scanner;
public class DoWhile{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char c;
		do{
			System.out.println("������");
			System.out.println("��Ǯ��y/n");
			c = in.next().charAt(0);


		}while(c != 'y');
}}