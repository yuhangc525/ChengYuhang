import java.util.Scanner;
public class Switch01{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	char c1 = in.next().charAt(0);
	switch(c1){
		case 'a':
			System.out.println("���Ӵ�����");
			break;
		case 'b':
			System.out.println("������ѩɽ");
			break;
		default:
			System.out.println("���벻��ȷ");
			break;
	}
	System.out.println("���˳�switch���");
}}