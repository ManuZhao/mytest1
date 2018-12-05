package cn.xx.testinterface;

import java.util.Random;

public class MyForeach {
    public static void main(String[] args){
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i=0;i<10;i++){
            f[i] = rand.nextFloat();
        }
        //任何返回数组的方法都可以使用foreach
        for(float x:f){
            System.out.println(x);
        }
    }
}
