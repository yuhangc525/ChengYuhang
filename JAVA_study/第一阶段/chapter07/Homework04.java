public class Homework04{
	public static void main(String[] args){
		A03 test = new A03();
		int[] nums = {1,2,3,4,5};
		int[] newNum = test.copyArr(nums);
		for (int i = 0;i<newNum.length;i++){
			System.out.println(newNum[i]);
			
		}
}}

class A03{
	public int[] copyArr(int[] nums){
		int n = nums.length;
		int newNum[] = new int[n];
		for (int i = 0;i<n;i++){
			newNum[i] = nums[i];
		}
		return newNum;
	}
}