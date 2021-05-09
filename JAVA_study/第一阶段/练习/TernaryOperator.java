public class TernaryOperator{
	public static void main(String[] args){
	int a = 10;
	int b = 99;
	
	int result = a < b ? a++ : b--;
	System.out.printf("result:%d\n", result);//10
	System.out.printf("a:%d\n",a);//11
	System.out.printf("b:%d\n",b);//99
	
	}
}