package cn.xx.learn;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 使用BigDecimal进行浮点数的比较
 * 浮点数存在舍入误差，数字不能精确表示。如果需要进行不产生舍入误差的精确数字计算，需要使用BigDecimal类
 * @author zjb
 */
public class TestBigDecimal {
    public static void main(String[] args){
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));

        BigInteger bi = BigInteger.valueOf(100);
        BigInteger a = BigInteger.valueOf(19);
        bi = bi.divide(a);
        System.out.println(bi);
        System.out.println(100/19);

        System.out.println(bd);
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
    }
}
