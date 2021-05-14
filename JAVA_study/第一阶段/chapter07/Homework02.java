public class Homework02{
	public static void main(String[] args){
		A02 test = new A02();
		String[] strs = {"names","zhang","li","wang"};
		int index = test.find(strs,"li");
		System.out.println(index);
}}
class A02{
	public int find(String[] strs,String str){
		int index = -1;
		for (int i = 0;i<strs.length;i++){
			if(str.equals(strs[i])){
				index = i;
				break;
			}
		}
		return index;
	}
}