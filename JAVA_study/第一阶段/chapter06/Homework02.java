import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		//������
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 12, 45, 90};
		do{
			System.out.println("������һ��������");
			int insertNum = myScanner.nextInt();//����Ԫ��
			int index = -1;//�ж�Ԫ�ض�λ���ĸ�����
			for(int i = 0;i< arr.length;i++){
				if(insertNum <= arr[i]){//��С��ĳ��Ԫ����������λ��
					index = i;
					break;
				}
			}
			if(index == -1){//����������ŵ����������
					index = arr.length;
			}
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0,j = 0;i < arrNew.length;i++){//iΪarrNew��ָ�룬jΪarr��ָ��
				if(i != index){
					arrNew[i] = arr[j];
					j++;
				} else {
					arrNew[i] = insertNum;
				}
			}
			arr = arrNew;
			//�������Ԫ�غ������
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " ");
			}
		}while(true);
	}
}