package cn.xx.learn;

public class TestEquals {
    public static void main(String[] args){
        Person p1 = new Person(123,"狗坤");
        Person p2 = new Person(123,"信驴");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        String s1 = new String("狗坤是脑残");
        String s2 = new String("狗坤是脑残");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
