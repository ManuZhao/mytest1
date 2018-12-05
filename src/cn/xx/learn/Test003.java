package cn.xx.learn;

public class Test003 {
    private static int myValue = 1;

    public static void main(String[] args){
        Thread t = new Thread(()->{
            while(true){
                updateBlance();
            }
        });
        t.start();

        t = new Thread(()->{
            while (true){
                monitorBlance();
            }
        });
        t.start();
    }

    public static synchronized void updateBlance(){
        System.out.println("start:" + myValue);
        myValue = myValue + 1;
        myValue = myValue - 1;
        System.out.println("end:" + myValue);
    }

    public static synchronized void monitorBlance(){
        int b = myValue;
        if (b != 1){
            System.out.println("Balance changed:" + b);
            System.exit(1);
        }
    }
}



























