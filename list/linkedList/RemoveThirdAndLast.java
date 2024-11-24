package linkedList;

import java.util.LinkedList;

public class RemoveThirdAndLast {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        for(int i=1;i<=10;i++){
            list.add(i);
        }

        System.out.println("Before Removing: "+list);

        list.remove(2);
        list.removeLast();

        System.out.println("After Removing: "+list);

    }
}
