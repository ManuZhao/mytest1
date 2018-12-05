package cn.zjb.homework;

public class TestRecursionHomeWork {
    public static void main(String[] args){
        System.out.println(sum(3));
    }

    public static int sum(int i){
       if(i <= 0){
           return 0;
       }else if(i>0 && i<= 2){
           return 1;
       }else{
           return sum(i-1) + sum(i-2);
       }
    }
}

