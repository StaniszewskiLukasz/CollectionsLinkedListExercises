package pl.sda;

import java.util.LinkedList;

//Write a Java program to append the specified element to the end of a linked list
public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Coś");
        linkedList.add("Coś jeszcze");
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
    }
}
