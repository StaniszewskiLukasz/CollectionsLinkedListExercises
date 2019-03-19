package pl.sda;

import java.util.Iterator;
import java.util.LinkedList;
//Write a Java program to iterate a linked list in reverse order
public class Exercise4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        int size = linkedList.size();
        System.out.println(size);
        for (int i = size-1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }
//        Iterator iterator = linkedList.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
