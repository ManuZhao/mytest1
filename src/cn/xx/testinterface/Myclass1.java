package cn.xx.testinterface;

public class Myclass1 implements MyInterface{
    @Override
    public void test01() {
        //MyInterface.Gread;

        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("test02");
        return a+b;
    }
}
