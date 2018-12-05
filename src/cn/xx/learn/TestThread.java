package cn.xx.learn;

public class TestThread extends Thread{ //自定义线程类
    //run方法里是线程体
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(this.getName()+ ":" + i); //getName()返回线程名字
        }
    }

    public static void main(String[] args){
        TestThread tt1 = new TestThread();//创建线程
        tt1.start();//开启线程
        TestThread tt2 = new TestThread();
        tt2.start();
    }
}
