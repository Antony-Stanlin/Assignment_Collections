package linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RemoveFirstTwo {
    public static void main(String[] args) {
        Queue<String> list=new LinkedList<>(List.of("Alice", "Bob", "Charlie", "Diana"));

        System.out.println("Before removing: "+list);

        list.remove();
        list.remove();

        System.out.println("After removing: "+list);


    }
}
