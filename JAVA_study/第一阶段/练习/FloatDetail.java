public class FloatDetail{
	public static void main(String[] args){
		float a = 1.1f;
		double b = 1.1;
		double c = 1.1d;
		double d = .123;
		System.out.println(5.12e2);
		System.out.println(5.12e-2);
		//当我们对运算结果是小数的进行相等判断时，
		//要小心应该是以两个数的差值的绝对值，
		//在某个精度范围内进行判断
		double e = 2.7;
		double f = 8.1 / 3;
		System.out.println(e);
		System.out.println(f);
		if( e == f ){
			System.out.println("相等");
		}
		if( Math.abs(e - f) < 0.000001){
			System.out.println("差值非常小，在精度范围内认为相等");
		}
	}
	
}