package vector;

import java.util.Vector;

public class RetriveAndPrint {
    public static void main(String[] args) {
        
        Vector<Integer> vector=new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);


        System.out.println("Third Element: "+vector.get(2));

        System.out.println(vector);
    }
}
