package OutputStream;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/22
 * @describe:使用buffered完成图片，视频的拷贝
 */

import java.io.*;

@SuppressWarnings({"all"})
public class BufferedCopy02 {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "f:\\照片电子版.jpg";
        String filePath = "f:\\picture_copy.jpg";
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        byte[] chars = new byte[1024];
        int readLen = 0;
        try {
            bi = new BufferedInputStream(new FileInputStream(srcFilePath));
            bo = new BufferedOutputStream(new FileOutputStream(filePath));
            while ((readLen = bi.read(chars)) != -1) {
                bo.write(chars, 0, readLen);
            }
            System.out.println("拷贝完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bi != null) {
                    bi.close();
                }
                if (bo != null) {
                    bo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
