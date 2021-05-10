import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			double sum = 0;
			for(int j = 1;j<=5;j++){
				System.out.printf("请输入第%d个班第%d学生成绩：\n",i,j);
				double score = in.nextDouble();
				sum += score;
			}
			System.out.printf("第%d班总分为%.2f\n",i,sum);
		}
}}