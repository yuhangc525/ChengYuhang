import java.util.Scanner;
public class TwoDime{
	public static void main(String[] args){
		int[][] arr = {{0,2,0},{1,0,0},{0,0,3}};
		for (int i = 0;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
}}