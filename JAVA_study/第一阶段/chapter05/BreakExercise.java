import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String passwd = "";
		for (int i = 1;i <= 3;i++){
			System.out.println("�������˺ţ�");
			name = in.nextLine();
			System.out.println("����������:");
			passwd = in.nextLine();
			if("chengyuhang".equals(name)&&"666".equals(passwd)){
				System.out.println("��¼�ɹ�");
				break;
			}
			chance--;
			System.out.printf("����%d�λ���\n",chance);
		}
}}