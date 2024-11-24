package linkedList;

import java.util.LinkedList;
import java.util.List;

public class FindFistLast {
    public static void main(String[] args) {
        //LinkedList<Integer> list=new LinkedList<>(List.of( 5, 10, 15, 20,25));
        
        // System.out.println("First element="+list.get(0));
        // System.out.println("FLast element="+list.get(list.size()-1));

        LinkedList<Integer> list=new LinkedList<>(List.of( 5, 10, 15, 20,25));

        System.out.println("First element="+list.peekFirst());
        System.out.println("FLast element="+list.peekLast());

    }
}
