public class Homework03{
	public static void main(String[] args){
		int[] arr = new int[10];
		double sum = 0;
		int max = arr[0];
		int maxIndex = 0;
		int index = -1;
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() * 100) + 1;//�������10��1-100������
			sum += arr[i];
		}
		//�����ӡ
		for(int i = arr.length - 1;i >= 0;i--){
			System.out.print(arr[i] + " ");
		}
		//��ƽ��ֵ�����ֵ�����±�
		double avg = sum / arr.length;
		System.out.println("\n" + "ƽ��ֵΪ" + avg);
		for(int i = 1;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("���ֵΪ" + max + "�����ֵ������Ϊ" + maxIndex);
		//��ѯ�Ƿ���8
		int findNum = 8;
		for(int i = 0;i < arr.length;i++){
			if(findNum == arr[i]){
				index = i;
				System.out.println("���ҵ�8�����±�Ϊ��" + index);
				break;
			}
		}
		if(index == -1){
			System.out.println("������û��" + findNum + "���Ԫ��");
		}
	}
}