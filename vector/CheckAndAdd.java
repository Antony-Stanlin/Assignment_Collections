package vector;

import java.util.Vector;

public class CheckAndAdd {
    public static void main(String[] args) {
        Vector<Double> vector=new Vector<>();

        for(int i=0;i<5;i++)
            vector.add((int)(1000*Math.random())*100.0/1000);
        
        System.out.println("Vector size before adding element: "+vector.size());

        if (!vector.contains(10.5)) {
            vector.add(10.5);
        }

        System.out.println("Vector size after adding element: "+vector.size());
    }
}
