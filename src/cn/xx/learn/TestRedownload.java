package cn.xx.learn;

public class TestRedownload {
    public static void main(String[] args){
        System.out.println(add(3, 5));
        System.out.println(add(3, 5, 6));
        System.out.println(add(1.0, 2));
        System.out.println(add(1, 1.0));
        System.out.println(add(2.0, 4.0));
    }

    public static int add(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }

    public static int add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }

    public static double add(double d1, double d2){
        double sum = d1 + d2;
        return sum;
    }

    public static double add(double n1, int n2){
        double sum = n1 + n2;
        return sum;
    }

    public static double add(int n1, double n2){
        double sum = n1 + n2;
        return sum;
    }
}
