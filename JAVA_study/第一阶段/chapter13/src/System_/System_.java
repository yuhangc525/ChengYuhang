package System_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/2
 * @describe:
 */

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
//        System.out.println("ok1");
//        System.exit(0);
//        System.out.println("0k2");
        int[] src = {1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src,1,dest,1,2);
        System.out.println(Arrays.toString(dest));

        System.out.println("============");
        System.out.println(System.currentTimeMillis());
    }
}
