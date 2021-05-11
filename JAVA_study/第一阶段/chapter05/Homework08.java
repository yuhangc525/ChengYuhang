import java.util.Scanner;
public class Homework08{
	public static void main(String[] args){
	int num = 100;
	double sum = 0;
	for (int i = 1; i <= num;i++){
		if(i%2!=0){
			sum += 1.0/ i;
		}else{
			sum -= 1.0/ i;
		}
	}
	System.out.printf("%.2f\n",sum);
}}