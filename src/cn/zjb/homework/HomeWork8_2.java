package cn.zjb.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork8_2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        System.out.println("请输入分数：");
        String score = sc.nextLine();
        System.out.println("请输入入学时间：");
        String s = sc.nextLine();
        int age1 = Integer.parseInt(age);
        double score1=Double.parseDouble(score);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        //String sd = sdf.format(s);
        Date date = sdf.parse(s);
        System.out.println("年龄："+age1);
        System.out.println("分数："+score);
        System.out.println(date);
    }
}
