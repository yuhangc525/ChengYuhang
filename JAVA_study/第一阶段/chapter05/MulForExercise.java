import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			double sum = 0;
			for(int j = 1;j<=5;j++){
				System.out.printf("�������%d�����%dѧ���ɼ���\n",i,j);
				double score = in.nextDouble();
				sum += score;
			}
			System.out.printf("��%d���ܷ�Ϊ%.2f\n",i,sum);
		}
}}