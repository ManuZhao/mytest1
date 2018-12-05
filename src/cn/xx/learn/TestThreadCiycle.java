package cn.xx.learn;

public class TestThreadCiycle implements Runnable{
    String name;
    boolean live = true; //标记变量，表示线程是否可终止
    public TestThreadCiycle(String name){
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        while(live){
            System.out.println(name + (i++));
        }
    }

    public void terminate(){
        live = false;
    }

    public static void main(String[] args){
        TestThreadCiycle ttc = new TestThreadCiycle("线程A");
        Thread t1 = new Thread(ttc);
        t1.start();
        for(int i=0; i<100; i++){
            System.out.println("主线程" + i);
        }
        ttc.terminate();
        System.out.println("ttc stop!");
    }
}
