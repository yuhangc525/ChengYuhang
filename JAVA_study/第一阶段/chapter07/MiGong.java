public class MiGong{
	public static void main(String[] args){
		// 1.�ȴ����Թ����ö�ά�����ʾ
		// 2.0��ʾ���ϰ���1��ʾ���ϰ���
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
		System.out.println("======��ǰ��ͼ���=====");
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
	// i��j��ʾ��������λ�ã���ʼλ��Ϊ��1,1����
	// 0��ʾ���ϰ���1��ʾ���ϰ��2��ʾ�����ߣ�3��ʾ�߹��������߲�ͨ����·��
	// ��map[6][5]=2ʱ����˵���ҵ�ͨ·���Ϳ��Խ�������������ң�
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
