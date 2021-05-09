public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//1.
		int num = 59;
		int week = num / 7;
		int day = num % 7;
		System.out.printf("%d weeks %d days.",week,day);
		
		//2.
		double hua = 234.5;
		double sh = 5.0/9*(hua-100);
		System.out.println();
		System.out.printf("%.2f",sh);
	}
}