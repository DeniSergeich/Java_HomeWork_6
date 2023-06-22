package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        MySet m = new MySet();
        System.out.println(m.add(1));
        System.out.println(m.add(11));
        System.out.println(m.add(111));
        System.out.println(m.add(1111));
        System.out.println(m.add(11111));
        System.out.println(m.add(111111));
        System.out.println(m.remove(111));
        System.out.println(m.isEmpty());

        Iterator<Integer> iterator = m.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }
    }
}
class MySet{
    private HashMap<Integer, Object> list = new HashMap<>();
    private static final Object X = new Object();
    public boolean add(int elem){
        return list.put(elem, X) == null;
    }
    public boolean remove(int elem){
        return list.remove(elem) == X;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public boolean contains (int elem){
        return list.containsKey(elem);
    }
    public int get (int index) {//метод, чтобы вернуть значение по индексу
        Object[] a=list.keySet().toArray();
        return (int) a[index];
    }
    public Iterator<Integer> iterator(){
        return list.keySet().iterator();
    }
}