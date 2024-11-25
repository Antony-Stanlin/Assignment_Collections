package map;

import java.util.HashMap;
import java.util.Map;

public class BasicMapOperations {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();

        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("Diana", 28);
        map.put("Edward", 40);

        System.out.println("The age of \"Charlie\" was "+map.get("Charlie"));

        System.out.println(map);
    }
}
