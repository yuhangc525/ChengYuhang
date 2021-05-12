public class Recursion02{
	public static void main(String[] args){
		T t = new T();
		int num = t.factorial(5);
		System.out.println(num);
}}
class T{
	public int factorial(int n){
		int all = 1;
		if (n == 1){
			return 1;
		}else{
			return factorial(n-1)*n;
		}
	}
}
