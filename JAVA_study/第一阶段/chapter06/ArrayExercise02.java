import java.util.Scanner;
public class ArrayExercise02{
	public static void main(String[] args){
		double[] nums = {4,-1.9,10,23};
		int maxIndex = 0;
		double max = nums[0];
		for (int i = 1;i<nums.length;i++){
			if (max < nums[i]){
				maxIndex = i;
				max = nums[i];
			}
		}
		System.out.println(max);
}}