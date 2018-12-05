package cn.zjb.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7_1 {
    public static void main(String[] args){
        String[] str = new String[]{"hello", "bb", "cc", "dd", "ee", "ff", "gg", "aa", "rr", "world"};
        //System.out.println(str.length);

        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if(s.equals(str[Arrays.binarySearch(str, s)])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
