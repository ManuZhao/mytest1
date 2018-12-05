package cn.xx.testinterface;

public interface MyInterface {
    //接口中只有：常量，抽象方法
    /*public static final 接口中长岭定义时写或不写总是有*/
    String Gread = "BOSS";
    int max = 120;

    //不能加private，写或不写都是public abstract
    public void test01();
    public int test02(int a, int b);
}


