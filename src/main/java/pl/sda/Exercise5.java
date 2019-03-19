package pl.sda;

import java.util.LinkedList;
//Write a Java program to insert the specified element at the specified position in the linked list.
public class Exercise5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        linkedList.add(5,"Coś Innego, coś lepszego");
        System.out.println(linkedList);//można tak
        for (String s : linkedList) {//lub tak
            System.out.println(s);
        }
    }
}
