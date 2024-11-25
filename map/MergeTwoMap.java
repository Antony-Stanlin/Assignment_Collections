package map;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMap {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap();
        
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String,Integer> map2=new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);

        map2.forEach((key,value) -> map1.put(key, value));
        
        System.out.println("Merged map: "+map1);
    }
}
