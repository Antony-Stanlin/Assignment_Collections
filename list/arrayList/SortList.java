package arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortList {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1; 
            numbers.add(randomNumber);
        }

        System.out.println("Original List: " + numbers);

        mergeSort(numbers, 0, numbers.size() - 1);

        System.out.println("Sorted List: " + numbers);
    }

    public static void mergeSort(List<Integer> array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(List<Integer> array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();

        for (int i = 0; i < n1; i++)
            L.add(array.get(left + i));
        for (int j = 0; j < n2; j++)
            R.add(array.get(middle + 1 + j));

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                array.set(k, L.get(i));
                i++;
            } else {
                array.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            array.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            array.set(k, R.get(j));
            j++;
            k++;
        }
    }
}
