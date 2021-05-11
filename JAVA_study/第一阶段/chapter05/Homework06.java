import java.util.Scanner;
public class Homework06{
	public static void main(String[] args){
		int num = 100;
		int n = 0;
		for(int i = 1;i<=num;i++){
			if (i % 5 != 0){
			System.out.print(i + " ");
			n++;
			if(n%5==0){
				System.out.println("");
			}
			}
		}
}}		