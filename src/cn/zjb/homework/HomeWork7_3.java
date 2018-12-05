package cn.zjb.homework;

import java.util.Arrays;

public class HomeWork7_3 {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len = a.length;

        for(int i=0; i<5; i++){
            int temp;
            temp = a[i];
            a[i] = a[len-i-1];
            a[len-i-1] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
