public class ForExercise02{
	public static void main(String[] args){
		int n = 100;
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= n;i++){
			if (i % 9 == 0){
				System.out.println(i);
				count++;
				sum += i;
			}
		}
		
		int num = 10;
		for (int j = 0;j <= num;j++){
			System.out.printf("%d + %d = %d\n",j,num-j,num);
		}
		
}}