package cn.xx.learn;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

class Node{
    Object obj;
    Node previous;
    Node next;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(){}

    public Node(Object obj, Node previous, Node next){
        super();
        this.obj = obj;
        this.previous = previous;
        this.next = next;
    }
}

public class MyLinkedList {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    public void add(Object obj){
        Node n = new Node();
        //首先判断链表是否为空
        if (first == null){
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            first = n;
            last = n;
        }else{
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }

        size++;
    }

    public Node node(int index){
        Node temp = null;

        if (first != null){
            temp = first;
        }

        for (int i = 0; i <index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void add(int index, Object obj){
        Node temp = node(index);
        Node newNode = new Node();
        newNode.obj = obj;

        if (temp != null){
            newNode.previous = temp.previous;
            temp.previous.next = newNode;
            newNode.next = temp;
            temp.previous = newNode;
        }

        size++;
    }

    public int size(){
        return size;
    }

    private void rangeCheck(int index){
        if (index <0 || index >= size){
            try{
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public Object get(int index){
        rangeCheck(index);
        Node temp = node(index);
        if (temp != null){
            return temp.obj;
        }

        return null;
    }

    public void remove(int index){
        Node temp = node(index);
        if (temp != null){
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            size--;
        }
    }

    public static void toString(MyLinkedList list){
        ArrayList arrayList = new ArrayList();
        for (int i=0; i<list.size(); i++){
            arrayList.add(list.get(i));
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.add("你好");
        list.add("哦哦");
        list.add("Java");
        list.add("谢谢");
        list.remove(1);
        list.add(1,"再见啊");
        list.add(2,"开心呢");
        System.out.println(list.size());
        toString(list);
    }
}




















