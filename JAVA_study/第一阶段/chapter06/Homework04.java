public class Homework04{
	public static void main(String[] args){
		//ð���������
		int[] arr = {89,56,78,23,45,99,-2};
		int temp = 0;
		for(int i = 0;i < arr.length - 1;i++){//�Ƚ�����
			for(int j = 0;j < arr.length - 1 - i;j++){//ÿ�ֱȽϴ���
				if(arr[j] < arr[j+1]){//��С�������� ���Ӵ�С��>��Ϊ<����
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
		System.out.println("===�����===");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}