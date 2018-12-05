package cn.zjb.homework;

public class HomeWork5_3 {
    public static void main(String[] args){
        System.out.println("大家好，我是9亿少女的梦");
        Artist5_3 artist = new Artist5_3();
        artist.actMovie();
        artist.sing();
        artist.actTv();
    }
}

class Artist5_3 {
    public void sing(){
        System.out.println("我可以唱歌");
    }

    public void actMovie(){
        System.out.println("我可以拍电影");
    }

    public void actTv(){
        System.out.println("我可以拍电视剧");
    }
}