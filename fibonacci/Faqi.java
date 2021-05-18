public class Faqi {
    public static void main(String[] args) {
        int n = 7;
        int[] nums = new int[n];//创建数组存储每个数列值，并以此迭代
        T t = new T(n,nums);
        t.f(n);//进行递归
        for (int i = 0; i < n; i++) {
            System.out.print(t.nums[i]+" ");//输出数列
        }

    }
}
class T {
    int n;
    public int[] nums;

    public T(int n,int[] nums) {
        this.n = n;
        this.nums = nums;
    }

    public void  f(int n){
        if (n==1){
            nums[0] = 1;
        }else if(n==2){
            nums[1] = 1;
            f(n-1);
        }else{
            f(n-1);
            nums[n-1] = nums[n-2] + nums[n-3];
        }
    }
}