public class Homework01{
	public static void main(String[] args){
		double[] n = {0.1,0.5,4.5,99,101};
		A01 test = new A01();
		System.out.println(test.max(n));
}}

class A01{
	public double max(double nums[]){
		double max_num = nums[0];
		for (int i = 1;i < nums.length;i++){
			if(max_num < nums[i]){
				max_num = nums[i];
			}
		}
		return max_num;
	}
}