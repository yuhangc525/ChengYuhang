public class Homework06{
	public static void main(String[] args){
		Cale c = new Cale();
		System.out.println(c.jia(1,2));
		System.out.println(c.jian(1,2));
		System.out.println(c.cheng(1,2));
		System.out.println(c.chu(1,0));
}}
class Cale{
	public double jia(double a ,double b){
		return a+b;
	}
	public double jian(double a ,double b){
		return a-b;
	}
	public double cheng(double a ,double b){
		return a*b;
	}
	public double chu(double a ,double b){
		if(b!=0){
			return a/b;
		}else {
			System.out.println("除数不能为零。");
			return -1;
		}
	}
}