package cn.xx.learn;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args){
        Set<String> s = new HashSet<String>();
        s.add("hello");
        s.add("world");
        System.out.println(s);
        s.add("hello");
        System.out.println(s);
        s.add(null);
        System.out.println(s);
        s.add(null);
        System.out.println(s);
    }
}
