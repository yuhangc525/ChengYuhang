public class RecursionExercise02{
	public static void main(String[] args){
		int days = 10;
		T t = new T();
		int sum = t.peach(1);
		System.out.println(sum);
}}
class T{
	public int peach(int n){
		if (n == 10){
			return  1;
		}else{
			return 2*(peach(n+1)+1);
		}
	}
}