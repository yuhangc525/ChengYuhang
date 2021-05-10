import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if (age > 18){
			System.out.println("你必须对你的行为负责");
		}else{
			System.out.println("你要小心你的行为");
		}
		
	}
}