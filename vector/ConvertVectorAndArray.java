package vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ConvertVectorAndArray {
    public static void main(String[] args) {
        
        Vector<String> vector=new Vector<>(List.of("red", "green", "blue", "yellow"));

        String[] a=toArrayStrings(vector);
        System.out.println("In Array Format: "+Arrays.toString(a));

        Vector<String> conVector=toVectorStrings(a);
        System.out.println("In Vector Format: "+conVector);
    }

    public static String[] toArrayStrings(Vector<String> vector){
        int len=vector.size();
        String a[]=new String[len];

        for(int i=0;i<len;i++)
            a[i]=vector.get(i);

        return a;
    }

    public static Vector<String> toVectorStrings(String[] a){
        Vector<String> vector=new Vector<>();

        for(String i:a)
            vector.add(i);

        return vector;
    }
}
