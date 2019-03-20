package pl.sda;

import java.util.LinkedList;

//Write a Java program to join two linked lists
public class Exercise13 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        LinkedList<String> nextLinkedList = new LinkedList<String>();
        nextLinkedList.add("Black");
        nextLinkedList.add("White");
        nextLinkedList.add("Gray");
        System.out.println(nextLinkedList);
        linkedList.addAll(nextLinkedList);
        System.out.println(linkedList);
    }
}
