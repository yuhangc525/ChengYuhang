package standard;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/23
 * @describe:
 */

public class InputAndOutput {
    public static void main(String[] args) {
        //system.in 编译类型 InputStream
        //system.in 运行类型 BufferedInputStream
        //表示的是标准输入为键盘
        System.out.println(System.in.getClass());
        //system.out 编译类型 PrintStream
        //system.out 运行类型 PrintStream
        //标准输出到显示器
    }
}
