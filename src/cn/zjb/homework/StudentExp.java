package cn.zjb.homework;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentExp implements Comparable<StudentExp>{
    private String no;
    private String name;
    private int age;
    public StudentExp(String no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((no == null) ? 0 : no.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentExp other = (StudentExp) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (no == null) {
            if (other.no != null)
                return false;
        } else if (!no.equals(other.no))
            return false;
        return true;
    }
    public int compareTo(StudentExp s){
        int i = 0;
        if(age>=s.age){
            i=1;
        }else if(age<s.age){
            i=-1;
        }
        return i;
    }
    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
    }
}
/**
  * @author 
  *2.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，
  *当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中，
  *再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；
  *最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。
  */
class TreeSetDemo {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        System.out.println("请输入多个学生信息：（格式为编号#姓名#年龄）");
        Scanner sc=new Scanner(System.in);
        TreeSet<StudentExp> ts=new TreeSet<StudentExp>();
        String input=sc.next();
        while(!"exit".equals(input)){
            String[] split = input.split("#");
            ts.add(new StudentExp(split[0],split[1],Integer.parseInt(split[2])));
            input=sc.next();
        }
        System.out.println("程序退出！");
        for(StudentExp s:ts){
            System.out.println(s.toString());
        }
        sc.close();
    }
}
