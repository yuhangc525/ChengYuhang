package Bignum;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/2
 * @describe:
 */

import java.math.BigInteger;

public class BigInteger_ {
public static void main(String[] args) {
//    long l = 2357849187941848619999999999L;
    BigInteger bigInteger = new BigInteger("15649999999999999999");
    System.out.println(bigInteger);
    BigInteger bigInteger1 = new BigInteger("100");
    BigInteger add = bigInteger.add(bigInteger1);
    System.out.println(add);
    BigInteger sub = bigInteger1.subtract(bigInteger1);
    System.out.println(sub);

}
}

