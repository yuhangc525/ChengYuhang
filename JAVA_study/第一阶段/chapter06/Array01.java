import java.util.Scanner;
public class Array01{
	public static void main(String[] args){
		double[] hens = {3,5,1,3.4,2,50};
		double sum = 0;
		System.out.println("数组长度："+ hens.length);
		for (int i = 0;i<6;i++){
			System.out.println(hens[i]);
			sum += hens[i];
		}
		System.out.println(sum);
}}