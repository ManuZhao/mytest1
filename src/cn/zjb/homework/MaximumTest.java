package cn.zjb.homework;

public class MaximumTest {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if (y.compareTo(x) > 0){
            max = y;
        }

        if (z.compareTo(max) > 0){
            max = z;
        }

        return max;
    }

    public static void main(String[] args){
        System.out.println(maximum(3,4,5));
        System.out.println(maximum(4.5, 3.5, 2.5));
    }
}
