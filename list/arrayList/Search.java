package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    
    public static void main(String[] args) {
        List<Character> list=new ArrayList(List.of('a','b','c','d','e','f','g','h','i','j'));
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c=sc.next().charAt(0);
        System.out.println(find(c,list));

    }

    public static int find(char c,List list){
        int len=list.size();
        for(int i=0;i<len;i++)
            if((char)list.get(i)==c)
                return i;
        return -1;

    }
}
