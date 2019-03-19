package pl.sda;

import java.util.LinkedList;

//Write a Java program to iterate through all elements in a linked list
public class Exercise2 {
    public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<String>();
            System.out.println(linkedList);
            for (int i = 0; i < 10; i++) {
                linkedList.add("Coś" + i);
            }
        for (String arg : linkedList) {
            System.out.println(arg);
        }
    }

}

