package cn.zjb.homework;

import java.util.Arrays;

public class TestHomeWork2 {
    public static void main(String[] args){
        Man[] man = {new Man(3, "a"), new Man(60, "b"), new Man(2, "c")};
        Arrays.sort(man);
        System.out.println(Arrays.toString(man));

        float [][]f = new float[6][];
        int [ ] numbers=new int[ ]{1,2,3};
        System.out.println(Arrays.binarySearch(numbers, 2));
    }
}

class Man implements Comparable{
    int age;
    int id;
    String name;

    public Man(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Man man = (Man) o;
        if(this.age < man.age){
            return -1;
        }
        else if(this.age > man.age){
            return 1;
        }
        return 0;
    }
}