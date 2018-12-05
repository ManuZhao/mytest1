package cn.zjb.homework;

import java.util.*;

public class HomeWork9_1 {
    public static void main(String[] args){
        Books9_1 b1 = new Books9_1(1, "《追风筝的人》", 20.5, "北京出版社");
        Books9_1 b2 = new Books9_1(2, "《岛上书店》", 15.5, "人民出版社");
        Books9_1 b3 = new Books9_1(3, "《厚黑学》", 40.88, "清华大学出版社");
        Books9_1 b4 = new Books9_1(4, "《商业的本质》", 18.9, "河南出版社");
        Books9_1 b5 = new Books9_1(5, "《万里风来》", 30.99, "北京大学出版社");

        List<Books9_1> list= new ArrayList<Books9_1>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        //System.out.println(list.toString());

        Map<Integer, Books9_1> maps = new HashMap<Integer, Books9_1>();
        maps.put(b1.no, b1);
        maps.put(b2.no, b2);
        maps.put(b3.no, b3);
        maps.put(b4.no, b4);
        maps.put(b5.no, b5);

        Set<Integer> keySet =  maps.keySet();
        for(Integer id : keySet){
            System.out.println(maps.get(id));
        }
    }
}

class Books9_1 implements Comparable<Books9_1>{
    int no;
    String name;
    double price;
    String press;

    public Books9_1(int no, String name, double price, String press){
        super();
        this.no = no;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    @Override
    public int compareTo(Books9_1 o) {
        if(this.no > o.no){
            return 1;
        }else if(this.no < o.no){
            return -1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return "Books9_1 [no=" + no + ",name=" + name + ",price=" + price + ",press=" + press + "]";
    }
}