package cn.zjb.homework;

import java.util.HashSet;
import java.util.TreeSet;

public class HomeWork9_2{
    public static void main(String[] args){
        Books9_1 b1 = new Books9_1(1, "《追风筝的人》", 20.5, "北京出版社");
        Books9_1 b2 = new Books9_1(2, "《岛上书店》", 15.5, "人民出版社");
        Books9_1 b3 = new Books9_1(3, "《厚黑学》", 40.88, "清华大学出版社");
        Books9_1 b4 = new Books9_1(4, "《追风筝的人》", 20.5, "北京出版社");

        HashSet<Books9_1> hash = new HashSet<Books9_1>();
        TreeSet<Books9_1> tree = new TreeSet<Books9_1>();
        hash.add(b1);
        hash.add(b2);
        hash.add(b3);
        hash.add(b1);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);

        for (Books9_1 book: hash) {
            System.out.println(book);
        }

        System.out.println("*************************************************");

        for (Books9_1 book: tree) {
            System.out.println(book);
        }
    }
}
