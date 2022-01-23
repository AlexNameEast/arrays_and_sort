import sort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer arrays[] = {5, 3, 6, 9, 1, 0, 25, 44, 5, 7, 3};

        System.out.println(Arrays.toString(arrays));

        SelectionSort.sort(arrays);

        System.out.println(Arrays.toString(arrays));

    }
}
