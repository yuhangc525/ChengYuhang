//��ʾ��������÷�
public class ArichmeticOperator{
	public static void main(String[] args){
		System.out.println(10/2);
		System.out.println(10/2.0);
		//a%b ->  a-a/b*b
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1
		
		int i = 10;
		++i;//�������ٸ�ֵ
		i++;//�ȸ�ֵ������
		] System.out.println(i);
		int j = ++i;
		int m = i++;
		System.out.println(j+","+i+","+m);//13,13
	}
}