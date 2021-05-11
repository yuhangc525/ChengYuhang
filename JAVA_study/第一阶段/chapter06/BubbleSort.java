import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {24,69,80,57,13};
		int temp = 0;
		int n = arr.length;
		for(int i = 0;i<n-1;i++){
			for(int j = 0;j<n-i-1;j++){
				if (arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<5;i++){
			System.out.println(arr[i]);
		}
}}