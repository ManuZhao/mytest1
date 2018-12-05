package cn.xx.testSerializable;

import java.io.*;
import java.text.MessageFormat;

/**
 * 测试序列化和反序列化
 */
public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception{
        SerializePerson(); //序列化person对象
        Person001 p = DeserializePerson(); //反序列化
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                p.getName(),p.getAge(),p.getSex()));
    }

    /**
     * 序列化Person对象
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void SerializePerson() throws FileNotFoundException, IOException {
        Person001 person = new Person001();
        person.setName("qweq");
        person.setAge(25);
        person.setSex("男");

        //ObjectOutputStream对象输出流，将Person对象存储到e盘的Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    //反序列化Person对象
    private static Person001 DeserializePerson() throws Exception,IOException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/Person.txt")));
        Person001 person = (Person001) ois.readObject();
        System.out.println("person对象反序列成功！");
        return person;
    }
}
