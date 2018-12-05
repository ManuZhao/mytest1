package cn.xx.learn;

public class TestMyHash {
    public static int myHash(int h, int length){
        System.out.println(h & (length-1));

        System.out.println(h%length);
        return h&(length-1);
    }

    public static void main(String[] args){
        int h = 25860399;
        int length = 16;   //length为2的整数次幂
        myHash(h, length);
    }
}
