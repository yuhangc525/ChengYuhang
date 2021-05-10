import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String passwd = "";
		for (int i = 1;i <= 3;i++){
			System.out.println("请输入账号：");
			name = in.nextLine();
			System.out.println("请输入密码:");
			passwd = in.nextLine();
			if("chengyuhang".equals(name)&&"666".equals(passwd)){
				System.out.println("登录成功");
				break;
			}
			chance--;
			System.out.printf("还有%d次机会\n",chance);
		}
}}