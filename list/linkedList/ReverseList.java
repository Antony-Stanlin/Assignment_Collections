package linkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Character> list=new LinkedList<>(List.of('A', 'B', 'C', 'D', 'E'));

        System.out.println("Original: "+list);

        reverse(list);
        System.out.println("Reversed list: "+list);


    }

    public static void reverse(LinkedList<Character> list){
        int len=list.size();
        for(int i=0;i<len/2;i++){
            Character c=list.get(i);
            list.set(i,list.get(len-i-1));
            list.set(len-i-1,c);
        }
    }
}
