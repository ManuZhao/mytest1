package cn.zjb.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7_2 {
    public static void main(String[] args){
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[50];
        int total = 0;

        for(int i=0; i<50; i++){
            int num=(int)(n*Math.random());
            a[i] = num;
            if(num >= 60){
                total += 1;
            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(total);
    }
}
