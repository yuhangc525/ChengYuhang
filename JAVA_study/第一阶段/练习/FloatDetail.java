public class FloatDetail{
	public static void main(String[] args){
		float a = 1.1f;
		double b = 1.1;
		double c = 1.1d;
		double d = .123;
		System.out.println(5.12e2);
		System.out.println(5.12e-2);
		//�����Ƕ���������С���Ľ�������ж�ʱ��
		//ҪС��Ӧ�������������Ĳ�ֵ�ľ���ֵ��
		//��ĳ�����ȷ�Χ�ڽ����ж�
		double e = 2.7;
		double f = 8.1 / 3;
		System.out.println(e);
		System.out.println(f);
		if( e == f ){
			System.out.println("���");
		}
		if( Math.abs(e - f) < 0.000001){
			System.out.println("��ֵ�ǳ�С���ھ��ȷ�Χ����Ϊ���");
		}
	}
	
}