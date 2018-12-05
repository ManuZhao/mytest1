package cn.xx.learn;

public class TestSuper {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "小红";
        p.age = -45;
        System.out.println(p);
        //new ChildClass().f();
    }
}

class FatherClass{
    public int value;
    public void f(){
        value = 100;
        System.out.println("father.value = " + value);
    }
}

class ChildClass extends FatherClass{
    public int value;
    public void f(){
        super.f();
        value = 200;
        System.out.println("child.value = " + value);
        System.out.println(value);
        System.out.println(super.value);
    }

}
