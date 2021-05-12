public class MiGong{
	public static void main(String[] args){
		// 1.先创建迷宫，用二维数组表示
		// 2.0表示无障碍，1表示有障碍物
		int[][] map = new int[8][7];
		for (int i = 0;i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for (int i = 0;i<8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[2][1]=1;
		map[2][2]=1;
		System.out.println("======当前地图情况=====");
		for (int i = 0;i<map.length;i++){
			for (int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		T t = new T();
		t.findway(map,1,1);
		for (int i = 0;i<map.length;i++){
			for (int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
}}

class T{
	// i，j表示老鼠所在位置，初始位置为（1,1）；
	// 0表示无障碍，1表示有障碍物，2表示可以走，3表示走过，但是走不通是死路；
	// 当map[6][5]=2时，就说明找到通路，就可以结束，否则继续找；
	public boolean findway(int[][] map,int i,int j){
		if(map[6][5]==2){
			return true;
		}else{
			if(map[i][j]==0){
				map[i][j] = 2;
				if (findway(map,i+1,j)){
					return true;
				}else if (findway(map,i,j+1)){
					return true;
				}else if(findway(map,i-1,j)){
					return true;
				}else if(findway(map,i,j-1)){
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
			}else{
				return false;
			}
		}
	}
	
}
