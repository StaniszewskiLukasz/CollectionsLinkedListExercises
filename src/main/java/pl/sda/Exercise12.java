package pl.sda;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to shuffle the elements in a linked list
public class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }
}
