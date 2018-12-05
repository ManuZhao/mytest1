package cn.xx.learn;

public class TestThis {
    int id;
    String name;

    public TestThis(){

    }

    public TestThis(int id, String name){
        System.out.println("正在初始化已经创建好的对象：" + this);
        this.id = id;
        this.name = name;
    }

    public void login(){
        System.out.println(this.name+",要登录！");
    }

    public static void main(String[] args){
        TestThis u1 = new TestThis(101, "波神");

        System.out.println("打印对象：" + u1);
        u1.login();
    }
}
