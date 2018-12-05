package cn.xx.learn;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test002 {
    public static void main(String[] args){

        double a = 154.5555;
        // 垫交利息合计
        double b = 205.33333;
        DecimalFormat df = new DecimalFormat("#0.00");
        DecimalFormat df1 = new DecimalFormat("#.00");
        double sum=Double.valueOf(df.format(a))+Double.valueOf(df.format(b));
        System.out.println(sum);
        double sum4=Double.valueOf(df1.format(a))+Double.valueOf(df1.format(b));
        System.out.println(sum4);

        double sumNew = Double.valueOf(df.format(sum));
        System.out.println(sumNew);
        double sum1 = sum;
        System.out.println(sum1);
    }
}
