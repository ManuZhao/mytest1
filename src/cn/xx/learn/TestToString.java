package cn.xx.learn;

public class TestToString {
    public static void main(String[] args){
        Person p = new Person();
        p.age = 20;
        p.name = "李东";
        System.out.println("info:" + p);

        TestToString ts = new TestToString();
        System.out.println(ts);
    }
}

