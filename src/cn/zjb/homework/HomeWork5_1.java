package cn.zjb.homework;

public class HomeWork5_1 {
    public static void main(String[] args){
        Cylinder5_1 cylinder = new Cylinder5_1(6,5);
        cylinder.show();
        cylinder.showVolume();

    }
}

class Circle5_1 {
    float r;
    public Circle5_1(){}

    public Circle5_1(float r){
        this.r = r;
    }

    public double getArea(){
        double area = 3.14 * r * r;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * 3.14 * r;
        return perimeter;
    }

    public void show(){
        System.out.println(getPerimeter());
        System.out.println(getArea());
    }
}

class Cylinder5_1 extends Circle5_1{
    double height;


    public Cylinder5_1(float r, double height){
        super(r);
        this.height = height;
    }

    public double getVolume(){
        double v = super.getArea() * height;
        return v;
    }

    public void showVolume(){
        System.out.println(getVolume());
    }

}