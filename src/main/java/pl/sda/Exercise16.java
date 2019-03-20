package pl.sda;
//Write a Java program to remove and return the first element of a linked list.
import java.util.LinkedList;

public class Exercise16 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {
            linkedList.add("Coś" + i);
        }
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekLast());
    }
}
