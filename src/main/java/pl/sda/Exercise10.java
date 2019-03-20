package pl.sda;

import java.util.LinkedList;

//Write a Java program to display the elements and their positions in a linked list.
public class Exercise10 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Index " + i + " Wartość " + linkedList.get(i));
        }
    }

}
