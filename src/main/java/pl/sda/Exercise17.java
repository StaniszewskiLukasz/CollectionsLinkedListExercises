package pl.sda;
//Write a Java program to replace an element in a linked list.
import java.util.LinkedList;

public class Exercise17 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        linkedList.set(5, "Zmiana!!!");
        System.out.println(linkedList);
    }
}
