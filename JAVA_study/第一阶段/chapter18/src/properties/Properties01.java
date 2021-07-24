package properties;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/24
 * @describe:
 */

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");
            System.out.println(split[1]);
         }
    }
}
