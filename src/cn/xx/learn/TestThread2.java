package cn.xx.learn;

public class TestThread2 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+ ":" + i); //getName()返回线程名字
        }
    }

    public static void main(String[] args){
        Thread tt1 = new Thread(new TestThread2());//创建线程
        tt1.start();//开启线程
        Thread tt2 = new Thread(new TestThread2());
        tt2.start();
    }
}
