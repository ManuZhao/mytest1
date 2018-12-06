/**
 * 测试Integer的用法，其他包装类与Integer类似
 */
package cn.xx.learn;

import com.starnet.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.Stream;


public class Test001 {
    public static void main(String[] args){
        B b = new B();
        A a = new A();
        BeanUtils.copyProperties(b, a);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}

class A{
    int a;
    String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

class B{
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

