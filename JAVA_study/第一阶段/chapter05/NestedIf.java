import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("������ɼ�:");
	double score = in.nextDouble();
	
	if (score > 8.0){
		System.out.println("�������Ա�");
		char gender = in.next().charAt(0);
		if (gender == '��'){
			System.out.println("����������");
		}else if (gender == 'Ů'){
			System.out.println("����������");
		}else {
			System.out.println("�������");
		}
	}else{
		System.out.println("��̭");
	}
}}