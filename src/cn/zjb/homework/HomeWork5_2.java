package cn.zjb.homework;

public class HomeWork5_2 {
    public static void main(String[] args){
        Musicion5_2 musicion = new Musicion5_2();

        Instrument5_2 i1 = new Erhu5_2();
        musicion.play(i1);
    }
}

class Instrument5_2 {
    public void makeSound(){
        System.out.println();
    }
}

class Erhu5_2 extends Instrument5_2{
    @Override
    public void makeSound() {
        System.out.println("听我弹奏《二泉映月》");
    }
}

class Pinao5_2 extends Instrument5_2{
    @Override
    public void makeSound() {
        System.out.println("听我弹奏《肖邦的夜曲》");
    }
}

class Violin5_2 extends Instrument5_2{
    @Override
    public void makeSound() {
        System.out.println("听我弹奏《紫色激情》");
    }
}

class Musicion5_2{
    public void play(Instrument5_2 i){
        i.makeSound();
    }
}