package arrayList;
import java.util.*;
public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(10,20,30,40,50));
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
          Integer i = it.next();
          if(i > 30) {
            it.remove();
          }
        }

        System.out.println(numbers);

    }
}
