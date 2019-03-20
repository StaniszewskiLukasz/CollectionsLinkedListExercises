package pl.sda;

import java.util.LinkedList;
//Write a Java program to clone an linked list to another linked list.
public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        LinkedList<String> cloneOfLinkedList = new LinkedList<String>();
        cloneOfLinkedList = (LinkedList)linkedList.clone();
        System.out.println(cloneOfLinkedList + " Nowa lista");
    }
}
