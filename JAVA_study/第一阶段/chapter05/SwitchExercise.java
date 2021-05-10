import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		switch (c){
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;	
			default:
				System.out.println("others");
		}
		System.out.println("Input yout score:");
		double score = in.nextDouble();
		if (score >= 0 && score <= 100){
			switch ((int)(score / 60)){
				case 1:
					System.out.println("及格");
					break;
				case 0:
					System.out.println("不及格");
					break;
			}
		}
}}