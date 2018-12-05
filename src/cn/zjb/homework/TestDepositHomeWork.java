package cn.zjb.homework;

public class TestDepositHomeWork {
    public static void main(String[] args){
        int bj = 10000;

        double h1 = (0.35 / 100 + 1) * bj;
        System.out.println(Math.round(h1));
        double d1 = (1.5 / 100 + 1) * bj;
        System.out.println(Math.round(d1));
        double h2 = (0.35 / 100 + 1) * h1;
        System.out.println(Math.round(h2));
        double d2 = (2.10 / 100 + 1) * bj;
        System.out.println(Math.round(d2));
    }
}
