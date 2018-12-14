package cn.zjb.homework;

public class GenericTest {
    //泛型方法printArray
    public static <E> void printArray(E[] inputArray){
        //输出数组元素
        for (E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args){
        //创建不同类型数组： Integer, Double和Charcter
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        //System.out.println("整形数组元素为：");
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
