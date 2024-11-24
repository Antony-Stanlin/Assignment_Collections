package arrayList;

import java.util.*;

public class AddAndRetrive{
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.addAll(List.of("Apple","Banana","Strawberry","Cherry","Mango"));
        System.out.println(list.get(2));
    }
}