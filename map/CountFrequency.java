package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountFrequency {

    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();

        for(char c:s.toCharArray()){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

        sc.close();
    }
}