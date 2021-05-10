public class RandomTest{
	public static void main(String[] args){
		int num;
		int i = 1;
		do{
			num = (int)(Math.random()*100+1);
			if (num == 97){
				break;
			}
			i++;
		}while(true);
		System.out.println(i);
}}