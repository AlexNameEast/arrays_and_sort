import sort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer arrays[] = {5, 3, 6, 9, 1, 0, 25, 44, 5, 7, 3};

        System.out.println(Arrays.toString(arrays));

        SelectionSort.sort(arrays);

        System.out.println(Arrays.toString(arrays));

        Random random = new Random();
        final int kolNotebook = 10;
        Notebook[] notebook = new Notebook[kolNotebook];

        for (int i = 0; i < kolNotebook; i++) {
            notebook[i] = new Notebook((random.nextInt(40) + 1) * 50,
                    (random.nextInt(8) + 1) * 4,
                    (random.nextInt(5) + 1));
        }



    }
}
