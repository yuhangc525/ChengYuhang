package Set_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/4
 * @describe:以Set接口的实现类 HashSet 来讲解 Set 接口的方法
 */

import java.util.HashSet;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("luck");
        set.add("luck");
        set.add(null);

        set.remove(null);
        System.out.println(set);

    }
}
