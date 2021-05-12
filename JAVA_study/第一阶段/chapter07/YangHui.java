public class YangHui{
	public static void main(String[] args){
		int n = 5;
		int [][] num = new int[n][];
		for (int i = 0;i<n;i++){
			num[i] = new int[i+1];
		}
		
		num[0][0] = 1;
		for(int i = 1;i<n;i++){
			num[i][0] = 1;
			num[i][i] = 1;
		}
		
		for (int i = 2;i<n;i++){
			for (int j =1;j<num[i].length-1;j++){
				num[i][j] = num[i-1][j]+num[i-1][j-1];
			}
		}
		for (int i = 0;i<n;i++){
			for (int j =0;j<num[i].length;j++){
				System.out.print(num[i][j]+"\t");
		}
		System.out.println("");
		}
}}