public class Ifexercise{
	public static void main(String[] args){
		double d1 = 34.5;
		double d2 = 2.6;
		if (d1>10.0 && d2 < 20.0){
			System.out.println(d1 + d2);
		}
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		if (num1 % 3 == 0 && num2 % 5 == 0){
			System.out.println("�Ϳ��Ա�3���ܱ�5����");
		}else{
			System.out.println("�Ͳ��ܱ�3��5����");

		}
		
		
		int year = 2020;
		if (year % 400 == 0 || (year %4 == 0 && year % 100 != 0)){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
}}