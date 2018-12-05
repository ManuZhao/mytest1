package cn.xx.learn;

public class TestThread01 {
    public static void main(String[] args) throws Exception{
        Runnable r = new MyThread();
        Thread t = new Thread(r, "Name test");
        t.start();
        System.out.println("name is " + t.getName());
        Thread.currentThread().sleep(5000);
        System.out.println(t.isAlive());
        System.out.println("it's over");
    }
}

class MyThread implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}