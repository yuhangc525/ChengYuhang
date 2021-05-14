public class VarScope{
	public static void main(String[] args){
		Test test = new Test();
		test.test();
}}
class Test{
	int n = 3;
	public void test(){
		int n = 4;
		System.out.println("int="+n);
	}
}

