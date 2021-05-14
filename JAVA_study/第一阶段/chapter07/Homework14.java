import java.util.Random;
import java.util.Scanner;
public class Homework14{
	public static void main(String[] args){
		Tom t = new Tom();
		Scanner in = new Scanner(System.in);
		int winCount = 0;
		int [][] arr1 = new int[3][3];
		int j = 0;
		String[] arr2 = new String[3];
		
		for(int i = 0;i<3;i++){
			System.out.println("Please input a number");
			int num = in.nextInt();
			t.tom = num;
			t.computer = t.computer();
			arr1[i][0] = num;
			arr1[i][1] = t.computer;
			arr2[i] = t.compare();
			}
		for(int i = 0;i<3;i++){
			System.out.println(arr1[i][0]+"\t"+arr1[i][1]+"\t"+arr2[i]);
		}
		}
}
class Tom{
	int tom;
	int computer;
	public String compare(){
		if((tom==0 && computer==1)||(tom==1&&computer==2)||(tom==2&&computer==0)){
			return "你赢了";
		}else if (tom == computer){
			return "平局";
		}else{
			return "你输了";
		}
	}
	public int computer(){
		Random rm = new Random();
		int c = rm.nextInt(3);
		return c;
	}
}
