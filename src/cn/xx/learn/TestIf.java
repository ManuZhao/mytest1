package cn.xx.learn;

public class TestIf {
    public static void main(String[] args){
        int i = (int)((6 * Math.random()) + 1);
        int j = (int)((6 * Math.random()) + 1);
        int k = (int)((6 * Math.random()) + 1);

        System.out.println(Math.random());

        int count = i+j+k;
        System.out.println(count);

        if (count > 15){
            System.out.println("今天手气不错");
        }
        else if(count < 15 && count > 6){
            System.out.println("今天手气一般");
        }
        else{
            System.out.println("今天手气真差");
        }
    }
}
