package pl.sda;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program of swap two elements in an linked list
public class Exercise11 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        Collections.swap(linkedList,1,4);
        System.out.println(linkedList);
    }
}
