import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if (age > 18){
			System.out.println("�����������Ϊ����");
		}else{
			System.out.println("��ҪС�������Ϊ");
		}
		
	}
}