package cn.xx.learn;

public class MyHashMap {
    //默认初始化大小16
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    //默认负载因子 0.75
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    //临界值
    private int threshold;
    //元素个数
    private int size;
    //扩容次数
    private int resize;

    private HashEntry[] table;

    private MyHashMap(){
        table = new HashEntry[DEFAULT_INITIAL_CAPACITY];
        threshold = (int)(DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
        size = 0;
    }

    private int index(Object key){
        //根据key的hashcode 和 table 长度计算key在table中的位置
        return key.hashCode() % table.length;
    }

    public void put(Object key, Object value){
        //key为null时需要特殊处理，为简化实现忽略null值
        if(key == null){
            return;
        }
        int index = index(key);

        //遍历index位置的entry,若找到重复key则更新对应entry的值，然后返回
        HashEntry entry = table[index];
        while (entry != null){
            if (entry.getKey().hashCode() == key.hashCode() && entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
            entry = entry.getNext();
        }
        add(index, key, value);
    }

    private void resize(int capacity){
        if (capacity < table.length){
            return;
        }

        HashEntry[] newTable = new HashEntry[capacity];
        for (int i=0; i<table.length; i++){
            HashEntry old = table[i];
            while (old != null){
                HashEntry next = old.getNext();
                int index = index(old.getKey());
                old.setNext(newTable[index]);
                newTable[index] = old;
                old = next;
            }
        }

        table = newTable;
        threshold = (int)(table.length * DEFAULT_LOAD_FACTOR);
        resize++;
    }

    private void add(int index, Object key, Object value){
        HashEntry entry = new HashEntry(key, value, table[index]);
        table[index] = entry;

        if (size++ >= threshold){
            resize(table.length * 2);
        }
    }

    public Object get(Object key){
        if(key == null){
            return null;
        }
        HashEntry entry = getEntry(key);
        return entry == null ? null:entry.getValue();
    }

    private int size(){
        return size;
    }

    public HashEntry getEntry(Object key){
        HashEntry entry = table[index(key)];
        while (entry != null){
            if (entry.getKey().hashCode() == key.hashCode() && entry.getKey().equals(key)){
                return entry;
            }
            entry = entry.getNext();
        }
        return null;
    }

    public void remove(Object key){
        if (key == null){
            return;
        }

        int index = index(key);
        HashEntry pre = null;
        HashEntry entry = table[index];
        while (entry != null){
            if (entry.getKey().hashCode() == key.hashCode() && entry.getKey().equals(key)){
                if (pre == null){
                    table[index] = entry.getNext();
                }else {
                    pre.setNext(entry.getNext());
                }
                size--;
                return;
            }
            pre = entry;
            entry = entry.getNext();
        }
    }

    private boolean containsKey(Object key){
        if (key == null){
            return false;
        }
        return getEntry(key) != null;
    }

    private void clean(){
        for (int i=0; i<table.length; i++){
            table[i] = null;
        }
        this.size = 0;
    }
}

class HashEntry{
    private final Object key;
    private Object value;
    private HashEntry next;

    public HashEntry(Object key, Object value, HashEntry next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public HashEntry getNext() {
        return next;
    }

    public void setNext(HashEntry next) {
        this.next = next;
    }
}