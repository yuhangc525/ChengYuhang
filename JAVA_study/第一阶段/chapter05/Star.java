public class Star{
	public static void main(String[] args){
		int n = 5;
		for (int i = 1; i <= n;i++){
			for(int j = 1;j <= n - i;j++ ){
				System.out.print(" ");
			}
			System.out.print("*");
			if(i != 1&& i != n){
			for(int m = 1;m <= 2*i-1;m++){
				System.out.print(" ");
			}
			System.out.print("*");
		}
			System.out.println("");
		}
}}