package cn.zjb.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork8_3 {
    public static void main(String[] args){
        int a = new Random().nextInt(3);

        switch (TrafficLights.values()[a]){
            case red:
                System.out.println("停下");
                break;
            case yellow:
                System.out.println("慢行");
                break;
            case green:
                System.out.println("通行");
                break;
        }
    }
}

enum TrafficLights{
    red, green, yellow;
}
