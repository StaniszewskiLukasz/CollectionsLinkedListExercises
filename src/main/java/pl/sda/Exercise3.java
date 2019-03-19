package pl.sda;

import java.util.Iterator;
import java.util.LinkedList;

//Write a Java program to iterate through all elements in a linked list starting at the specified position
public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        Iterator iterator = linkedList.listIterator(5);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
