package cn.xx.learn;

import java.util.Arrays;
import java.util.LinkedList;

public class MyArrayList {
    private Object[] elementData;
    private int size;

    public int size(){
        return size;
    }

    public MyArrayList(){
        this(10);
    }

    public MyArrayList(int initialCapacity){
        if (initialCapacity < 0){
            try{
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void rangeCheck(int index){
        if(index >= size || index < 0){
            try {
                throw new Exception();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public Object get(int index){
        rangeCheck(index);

        return elementData[index];
    }

    public void ensureCapacity(){
        if (size == elementData.length){
            Object[] newArray = new Object[size*2-1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
    }

    public boolean add(Object obj){
        ensureCapacity();
        elementData[size] = obj;
        size++;
        return true;
    }

    public void add(int index, Object obj){
        rangeCheck(index);
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index+1, size-index);
        elementData[index] = obj;
        size++;
    }

    public Object remove(int index){
        rangeCheck(index);
        int arrnums = size-index-1;
        Object oldValue = elementData[index];
        if (arrnums > 0){
            System.arraycopy(elementData, index+1, elementData, index, arrnums);
        }
        elementData[--size] = null;
        return oldValue;
    }

    public boolean remove(Object obj){
        for (int i=0; i<size; i++){
            if (get(i).equals(obj)){
                remove(i);
            }
            break;
        }
        return true;
    }

    public Object set(int index, Object obj){
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }

    public static void main(String[] args){
        MyArrayList mylist=new MyArrayList(3);
        mylist.add("123");
        mylist.add("呵呵呵");
        mylist.add("哦哦");
        mylist.add("哈哈哈");
        mylist.add(1,"你好");
        String old=(String)mylist.remove(3);    //返回的是旧值
        System.out.println(old);
        System.out.println(mylist.remove("哦哦"));
        System.out.println(mylist.isEmpty());
        System.out.println(mylist.get(1));
        System.out.println(mylist.size());
        System.out.println(mylist.set(2, "你好啊"));   //返回旧值
        System.out.println(mylist.get(2));
        System.out.println(Arrays.toString(mylist.elementData));
    }

}



























