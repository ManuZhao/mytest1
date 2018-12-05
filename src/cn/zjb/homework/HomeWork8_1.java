package cn.zjb.homework;

import java.util.Scanner;

public class HomeWork8_1 {
    public static void main(String[] args){
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(str == null || " ".equals(str)){
            System.out.println("输入的字符串不能为空");
            return;
        }else if(str.length() <= 6){
            System.out.println("输入的字符串不能小于6");
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            //取出每个字符
            char ch = str.charAt(i);//'3'  '4'
            //判断每个字符是否是数字
            if(ch <='9'  && ch >='0'){
            //if (ch <= 57 && ch >= 48){
                System.out.println("用户名不能有数字");
                return;//退出main方法
            }
        }
        System.out.println("用户名符合要求");
    }
}
