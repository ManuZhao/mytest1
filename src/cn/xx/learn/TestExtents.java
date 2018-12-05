package cn.xx.learn;

/**
 * 测试继承&重写
 *  重写三要素：1.方法名、形参列表相同
 *              2.返回值类型和声明异常类型，子类<=父类
 *              3.访问权限，子类>= 父类
 * @author zjb
 */
public class TestExtents {
    public static void main(String[] args){
        Student stu = new Student("波神", 172, "代码搬运工");
        stu.rest();
        stu.study();
    }
}

class Person{
    String name;
    int height;
    int age;
    int id;
    public Person(){}

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) {
            return false;
        }else{
            if(obj instanceof Person){
                Person c = (Person)obj;
                if(c.id == this.id){
                    return true;
                }
            }
        }
        return false;
    }

    protected void rest(){
        System.out.println("休息一会儿");
    }

   /* public String toString(){
        return name + ",年龄:" + age;
    }*/

    @Override
    public String toString(){
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

class Student extends Person{
    String major;
    public void study(){
        System.out.println("自学成才");
    }

    public Student(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
}

class Man extends Person{
    public void rest(){
        System.out.println("I need 8 hours.");
    }
}

























