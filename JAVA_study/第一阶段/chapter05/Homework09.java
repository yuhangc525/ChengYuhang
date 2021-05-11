import java.util.Scanner;
public class Homework09{
	public static void main(String[] args){
		int num = 100;
		int sum = 0;
		int allSum = 0;
		for (int i = 1;i <= num;i++){
			sum += i;
			allSum += sum;
		}
		System.out.println(allSum);
}}