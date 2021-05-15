import java.util.Arrays;

//建议使用哪个类就导入哪个类
public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1,20,2,13,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
