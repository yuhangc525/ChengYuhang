package printStream;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:演示printStream字节打印流
 */

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，printStream输出数据的位置是标准输出，即显示器
        out.print("hello,world");
        //因为printstream底层使用的是write，所以我们可以直接调用write进行打印/输出
        out.write("c程宇航".getBytes());
        out.close();

        //我们可以去修改打印流输出的位置/设备

        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("hello,david");
    }
}
