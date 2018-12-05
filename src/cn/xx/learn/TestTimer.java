package cn.xx.learn;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args){
        Timer t1 = new Timer();
        MyTask m1 = new MyTask();
        //t1.schedule(m1,3000);
        //t1.schedule(m1, 5000, 1000);
    }
}

class MyTask extends TimerTask{
    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("任务1:" + i);
        }
    }
}
