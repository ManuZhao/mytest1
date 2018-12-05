/**
 * 测试Integer的用法，其他包装类与Integer类似
 */
package cn.xx.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test001 {
    public static void main(String[] args){
        double interestTmp = 10000 * (Math.pow(1 + 0.01, (double) 45 / (double) 360) - 1);
        double interestTmp1 = 10000 * (Math.pow(1 + 0.01, (double) 45 / (double) 365) - 1);
        System.out.println(interestTmp);
        System.out.println(interestTmp1);
    }
}

