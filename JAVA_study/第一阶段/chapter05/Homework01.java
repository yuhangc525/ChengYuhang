public class Homework01{
	public static void main(String[] args){
		double money = 100000;
		int num = 0;
		while(true){
			if (money>50000){
				money = money * 0.95;
			}else{
				money -= 1000;
			}
			num++;
			if (money<1000) break;
		}
		System.out.println(num);
}}