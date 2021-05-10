import java.util.Scanner;
public class If03{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int grade = in.nextInt();
		if (grade <= 100 && grade >=0){
			if (grade == 100){
				System.out.println("信用极好");
			}else if (grade > 80 && grade <= 99){
				System.out.println("信用优秀");
			}else if (grade >= 60 && grade <=80){
				System.out.println("信用一般");
			}else{
				System.out.println("信用不及格");
		}}else{
			System.out.println("请输入0~100的数。");
		}
}}