package cn.zjb.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestHomeWork1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字：");
        try {
            int num = input.nextInt();
            if (num < 1 || num > 4) {
                throw new Exception("必须在1-4之间！");
            }
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   /* 链接：https://www.nowcoder.com/questionTerminal/1ea3f4ec0f1d4a3ea7f9d942c9870f28
        来源：牛客网

        try:可能发生异常的语句
        catch:捕获，并处理异常（printStackTrace()用来跟踪异常事件发生时执行堆栈的内容）
        throw:方法内部抛异常
        throws:声明方法异常
        finaly：代码中无论是否有异常都会执行，清除资源*/
    private String stuId;
    public void setStuId(String stuId) throws Exception { // 1
        if (stuId.length() != 4) { // 2
            throw new Exception("学号必须为4位!"); // 3
        } else {
            this.stuId = stuId;     //4
        }
    }
}

class Base {
    public void method(){
        System.out.print ("Base method");
    }
}
class Child extends Base{
    public void methodB(){
        System.out.print ("Child methodB");
    }
}

class Person {
    public Person() {
        System.out.println("execute Person()");
    }
}
class Student extends Person {
    public Student() {
        System.out.println("execute Student() ");
    }
}
class PostGraduate extends Student {
    public PostGraduate() {
        System.out.println("execute PostGraduate()");
    }
}