package sort;

public class SelectionSort {
    public static void sort(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            int max = arr.length - 1 - i;

            for (int j = min + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[arr.length - j] > arr[max]) {
                    max = arr.length - j;
                }

            }

            changeValues(arr, i, min, max);

        }

    }

    private static void changeValues(Integer[] arr, int i, int min, int max) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;

        int temp2 = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = arr[max];
        arr[max] = temp2;
    }
}
