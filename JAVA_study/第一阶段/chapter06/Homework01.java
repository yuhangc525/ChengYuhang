import java.util.Scanner;
public class Homework01{
	public static void main(String[] args){
		//����һ
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 12, 45, 90};
		int temp = 0;
		do{
			System.out.println("������һ��������");
			int num = myScanner.nextInt();
			int[] arr1 = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arr1[i] = arr[i];
				arr1[arr.length] = num;
			}
			arr = arr1;//��������
			for(int i = arr.length - 1;i > 0;i--){//����
				if(arr[i] < arr[i - 1]){
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
			//�������Ԫ�غ����������
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println("�����������Ԫ����y/n");
			char answer = myScanner.next().charAt(0);
			if(answer == 'n'){
				break;
			}
		} while(true);
		System.out.println("����..");
	}
}