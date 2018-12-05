package cn.xx.learn;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = scan.nextLine();

        System.out.println(name);

        //String s="on"+"one";
    }
}
