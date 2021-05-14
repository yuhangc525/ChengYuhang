public class Homework03{
	public static void main(String[] args){
		Book book = new Book();
		double price = 200;
		price = book.updatePrice(price);
		System.out.println(price);
}}
class Book{
	public double updatePrice(double price){
		if (price >150){
			price = 150;
		}else if(price>100){
			price = 100;
		}
		return price;
	}
}