import java.util.Scanner;
public class If03{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int grade = in.nextInt();
		if (grade <= 100 && grade >=0){
			if (grade == 100){
				System.out.println("���ü���");
			}else if (grade > 80 && grade <= 99){
				System.out.println("��������");
			}else if (grade >= 60 && grade <=80){
				System.out.println("����һ��");
			}else{
				System.out.println("���ò�����");
		}}else{
			System.out.println("������0~100������");
		}
}}