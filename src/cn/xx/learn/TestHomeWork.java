package cn.xx.learn;

import java.util.Scanner;

public class TestHomeWork {
    int x, y;
    TestHomeWork(){

    }

    TestHomeWork(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void dog(){
        System.out.println("牛逼");
    }

    public static void main(String[] args) {
        TestHomeWork pt1, pt2;
        pt1 = new TestHomeWork(3, 3);
        pt2 = new TestHomeWork(4, 4);
        System.out.println(pt1.x + pt2.x);
    }
}

class Test extends TestHomeWork{
    static int count=9;
    public static void count1(){
        count = 10;
        System.out.println("count1="+count);
    }
    public void count2(){
        System.out.println("count2="+count);
    }
    public static void main(String[ ] args) {
        Test t= new Test();
        t.count1();
        t.count2();

        t.dog();
    }
}
