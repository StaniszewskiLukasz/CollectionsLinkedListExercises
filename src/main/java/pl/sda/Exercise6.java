package pl.sda;

import java.util.LinkedList;

//Write a Java program to insert elements into the linked list at the first and last position
public class Exercise6 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        linkedList.addFirst("Pierwszy element");
        linkedList.addLast("Ostatni element");
        System.out.println(linkedList);
    }
}
