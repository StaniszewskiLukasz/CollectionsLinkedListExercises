package pl.sda;

import java.util.LinkedList;

//Write a Java program to insert the specified element at the front of a linked list
public class Exercise7 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        linkedList.offerFirst("Coś innego");
        System.out.println(linkedList);
    }
}
