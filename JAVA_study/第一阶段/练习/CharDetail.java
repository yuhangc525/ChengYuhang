public class CharDetail{
	public static void main(String[] args){
		char c1 = 97;
		System.out.println(c1);//a
		System.out.println((int)c1);//a
		//��int���������Ӧ��Unicode����
		char c2 = 'a';
		System.out.println((int)c2);
		System.out.println(c2);
		
		char c3 = 'b' + 1;
		System.out.println(c3);
		System.out.println((int)c3);
	}
}