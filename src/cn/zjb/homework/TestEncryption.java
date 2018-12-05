package cn.zjb.homework;

import java.util.Scanner;

public class TestEncryption {
    public static void main(String[] args){
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int a1 = num / 1000;
        int a2 = num % 1000 / 100;
        int a3 = num % 100 / 10;
        int a4 = num % 10;
        System.out.printf("%d,%d,%d,%d\n",a1,a2,a3,a4);

        int b1 = (a1+5) % 10;
        int b2 = (a2+5) % 10;
        int b3 = (a3+5) % 10;
        int b4 = (a4+5) % 10;
        System.out.printf("%d,%d,%d,%d\n",b1,b2,b3,b4);

        int temp1 = b1;
        b1 = b4;
        b4 = temp1;

        int temp2 = b2;
        b2 = b3;
        b3 = temp2;

        int num2 = b1*1000 + b2*100 + b3*10 + b4;
        System.out.println(num2);
    }
}
