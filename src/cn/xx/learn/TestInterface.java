package cn.xx.learn;

public class TestInterface {
    public static void main(String[] args){
        Volant volant = new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);

        Honest honest = new GoodMan();
        honest.helpOther();
    }
}

/**
 * 飞行接口
 * @author zjb
 */
interface Volant{
    int FLY_HIGHT = 100;   //总是:public static final类型的
    void fly();             //总是：public abstract void fly()
}

/* 善良接口 */
interface Honest{
    void helpOther();
}

//Angel类实现飞行接口和善良接口
class Angel implements Volant, Honest{
    public void  fly(){
        System.out.println("我是天使，飞起来了！");
    }
    public void helpOther(){
        System.out.println("扶老奶奶过马路");
    }
}

class GoodMan implements Honest{
    public void helpOther(){
        System.out.println("我是个好男人");
    }
}

class BirdMan implements Volant{
    public void fly(){
        System.out.println("我是鸟人，我在飞");
    }
}














