import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double scores[] = new double[5];
		for (int i = 0; i<5;i++){
			scores[i] = in.nextDouble();
			System.out.println("³É¼¨£º"+ scores[i]);
		}
		
}}