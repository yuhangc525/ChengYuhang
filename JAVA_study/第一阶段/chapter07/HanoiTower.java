public class HanoiTower{
	public static void main(String[] args){
		Tower tower = new Tower();
		tower.move(3,'a','b','c');
}}
class Tower{
	public void move(int num,char a,char b,char c){
		if(num==1){
			System.out.printf("%c->%c\n",a,c);
		}else{
			move(num-1,a,c,b);
			System.out.printf("%c->%c\n",a,c);
			move(num-1,b,a,c);
		}
	}
}