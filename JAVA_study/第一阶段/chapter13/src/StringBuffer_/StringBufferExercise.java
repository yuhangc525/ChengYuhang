package StringBuffer_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/22
 * @describe:
 */

public class StringBufferExercise {
    public static void main(String[] args) {
        String price = "1323123456.789";
        StringBuffer sb = new StringBuffer(price);
        int i = sb.lastIndexOf(".")-3;
        for(;i>0;i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
    }

}
