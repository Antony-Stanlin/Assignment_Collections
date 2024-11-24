package vector;

import java.util.List;
import java.util.Vector;

public class InsertAndRemove {
    public static void main(String[] args) {
        
        Vector<Character> vector=new Vector<>(List.of('A', 'B', 'C', 'D', 'E'));

        System.out.println("Original vector: "+vector);

        vector.insertElementAt('x', 2);
        vector.remove(0);

        System.out.println("Modified vector: "+vector);
    }
}
