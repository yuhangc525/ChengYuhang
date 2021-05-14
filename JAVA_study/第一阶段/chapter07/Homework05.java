public class Homework05{
	public static void main(String[] args){
		Circle c = new Circle();
		c.r = 3;
		double zc = c.zouchang();
		double mj = c.mianji();
		System.out.println(zc);
		System.out.println(mj);
}}
class Circle{
	double r;
	public double zouchang(){
		return 2*3.14*r;
	}
	public double mianji(){
		return 3.14*r*r;
	}
}