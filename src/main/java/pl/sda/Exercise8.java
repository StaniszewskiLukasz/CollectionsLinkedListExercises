package pl.sda;

import java.util.LinkedList;

public class Exercise8 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        LinkedList<String> newLinkedList = new LinkedList<String>();
        newLinkedList.add("Inny");
        newLinkedList.add("Zupełnie inny");
        linkedList.addAll(4,newLinkedList);
        System.out.println(linkedList);
    }
}