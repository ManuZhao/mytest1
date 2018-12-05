package cn.zjb.homework;

import java.util.Scanner;

/**
 * 计算圆的周长和面积
 * @author zjb
 */
public class TestCircleHomeWork {
    public static void main(String[] args){
        System.out.println("请输入圆的半径:");
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double C = 2*r*3.14;
        double S = 3.14 * r * r;
        System.out.println("该圆的半径为：" + r);
        System.out.println("该圆的周长为：" + C);
        System.out.println("该圆的面积为：" + S);
    }
}
