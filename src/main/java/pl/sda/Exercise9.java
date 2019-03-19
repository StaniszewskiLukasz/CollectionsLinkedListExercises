package pl.sda;

import java.util.LinkedList;
//Write a Java program to get the first and last occurrence of the specified elements in a linked list
public class Exercise9 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList.indexOf("Coś5"));
        System.out.println(linkedList.lastIndexOf("Coś7"));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
