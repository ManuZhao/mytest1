package cn.zjb.homework;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork6_1 {
    public static void main(String[] args){
//        int [ ] numbers=new int[ ]{1,2,4,3};
//        System.out.println(Arrays.binarySearch(numbers, 4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int number = scanner.nextInt();

        try{
            if(number>0 && number<=100){
                System.out.println(number);
            }else{
                throw new Exception("必须在0~100之间");
            }
        }catch (Exception e){
            System.out.println("InputMismatchException");
        }
    }
}
