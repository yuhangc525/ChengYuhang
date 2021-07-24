package transformation;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:演示printWrite
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter_ {
    public static void main(String[] args) throws IOException {
//        PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("F:\\f2.txt"));
        printWriter.print("北京");
        printWriter.close();
    }
}
