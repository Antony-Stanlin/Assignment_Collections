package vector;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class AddAndModify {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>(List.of("apple", "banana", "cherry", "date", "fig"));

        Enumeration e=vector.elements();

        System.out.println("Original vector:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement()+" ");
        }

        int len=vector.size();
        for(int i=0;i<len;i++)
            if(vector.get(i)=="cherry")
                vector.set(i, "coconut");

        System.out.println("Modified Vector: "+vector);
    }
}
