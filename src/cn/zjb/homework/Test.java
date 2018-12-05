package cn.zjb.homework;

import java.util.*;

public class Test {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("hello");
        hashSet.add("world");
        System.out.println(hashSet);
        hashSet.add("hello");
        System.out.println(hashSet);
    }
}
