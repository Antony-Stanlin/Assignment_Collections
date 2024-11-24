package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateAndModify {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(List.of("one", "two", "three", "four", "five"));

        System.out.println("Original list: "+list);


        ListIterator<String> it=list.listIterator();

        while(it.hasNext()){
            //String current=(String)it.next();
            if(it.next().equals("three"))
                it.set("THREE");
        }

        System.out.println("Modified list: "+list);
    }
}
