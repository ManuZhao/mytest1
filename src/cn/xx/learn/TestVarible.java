package cn.xx.learn;

/**
 * 测试变量
 * @author zjb
 */


public class TestVarible {
    int a;                  //成员变量，从属于对象；成员变量会自动被初始化
    static int size;        //静态变量，从属于类

    public static void main(String[] args) {
        {
            int age = 18;  //局部变量，从属于语句块
        }

        int salary = 3000;  //局部变量，从属于方法
        int gao = 13;
        System.out.println(gao);

        /*int i;
        int j = i+1;   //编译错误，未初始化a*/
    }
}
