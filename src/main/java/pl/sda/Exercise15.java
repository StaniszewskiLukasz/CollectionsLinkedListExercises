package pl.sda;

import java.util.LinkedList;

//Write a Java program to remove and return the first element of a linked list.
public class Exercise15 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
    }
}
