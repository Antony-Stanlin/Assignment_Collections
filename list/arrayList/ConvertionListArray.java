package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertionListArray {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(List.of("apple", "banana", "cherry"));

        String a[]=toArray(list);

        System.out.println();
        System.out.print("Array format: ");
        System.out.println(Arrays.toString(a));

        ArrayList<String> covertedList=toArrayList(a);

        System.out.println();
        System.out.print("ArrayList format: ");
        System.out.println(covertedList);

        System.out.println();
    }

    public static String[] toArray(ArrayList<String> list) {
        int len=list.size();
        String a[]=new String[len];

        for(int i=0;i<len;i++)
            a[i]=list.get(i);
        
        return a;
    }

    public static ArrayList<String> toArrayList(String a[]){
        ArrayList<String> list=new ArrayList<>();
        for(String i:a)
            list.add(i);
        return list;
    }
}
