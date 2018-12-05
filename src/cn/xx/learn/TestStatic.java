package cn.xx.learn;

public class TestStatic {
    int id;
    String name;

    static String company = "中国人寿";

    public TestStatic(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void login() {
        printCompany();
        System.out.println(company);
        System.out.println("登录：" + name);
    }

    public static void printCompany(){
        //login();   调用非静态方法错误
        System.out.println(company);
    }

    public   void   testParameterTransfer01(TestStatic  u){
        u.name="高小八";
        System.out.println(this.name);
    }

    public  TestStatic  testParameterTransfer02(TestStatic  u){
        u  =  new  TestStatic(200,"高三");
        System.out.println(u.name);
        return u;
    }

    public static void main(String[] args){
        TestStatic ts = new TestStatic(101, "波神");
        System.out.println(ts.name);

        ts.testParameterTransfer01(ts);
        System.out.println(ts.name);

        ts = ts.testParameterTransfer02(ts);
        System.out.println(ts.name);
    }

}
