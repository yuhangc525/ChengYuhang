package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) {
        String filepath = "F:\\story.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            String line = "";
            int i = 1;
            while ((line = br.readLine()) != null){
                System.out.println(++i+"."+line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
