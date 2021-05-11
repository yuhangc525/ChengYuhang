import java.util.Scanner;
public class ArrayReverse{
	public static void main(String[] args){
		int[] arr = {11,22,33,44,55,66};
		int len = arr.length;
		int temp = 0;
		for (int i=0;i<len/2;i++){
			temp = arr[len -1-i];
			arr[len -1-i] = arr[i];
			arr[i] = temp;
		}
		for(int j = 0;j<len;j++){
			System.out.print(arr[j]);
		}
}}