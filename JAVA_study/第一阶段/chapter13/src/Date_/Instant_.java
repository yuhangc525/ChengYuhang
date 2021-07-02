package Date_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/2
 * @describe:第三代日期时间
 */

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        //1.通过静态方法 now（）获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2.通过 from 可以把 Instant 转成 Date
        Date date = Date.from(now);
        System.out.println(date);
        //3. 通过date的toInstant（）可以把date转成Instant对象
        Instant instant = date.toInstant();

    }
}
