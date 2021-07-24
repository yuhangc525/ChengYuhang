package FileWriter;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:使用buffered实现文件拷贝
 */

import javax.lang.model.element.NestingKind;
import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "f:\\story.txt";
        String filePath = "f:\\story_copy.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(filePath));
            while ((line = br.readLine())!=null){
                bw.write(line);
                //write(line) 每读取一行，但是没有换行
                bw.newLine();
            }
            System.out.println("拷贝完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
