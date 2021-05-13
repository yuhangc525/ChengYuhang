public class OverLoad01{
	public static void main(String[] args){
		MyCalculator cal = new MyCalculator();
		int sum = cal.calculate(2,3);
		System.out.println(sum);
		System.out.println(cal.sum(4,5,6));
		
}}
class MyCalculator{
	public int calculate(int n1,int n2){
		return n1 + n2;
	}
	public double calculate(int n1,double n2){
		return n1 + n2;
	}
	public double calculate(double n1,int n2){
		return n1 + n2;
	}
	public int sum(int ... nums){
		int sum = 0;
		for (int i = 0; i<nums.length;i++){
			sum += nums[i];
		}
		return sum;
	}
	
}