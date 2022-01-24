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
        int kolNotebook = 100;
        Notebook[] notebook = new Notebook[kolNotebook];

        for (int i = 0; i < kolNotebook; i++) {
            notebook[i] = new Notebook((random.nextInt(40) + 1) * 50,
                    (random.nextInt(8) + 1) * 4,
                    (random.nextInt(5) + 1));
        }


        sortNotebookPrice(notebook);
        sortNotebookRam(notebook);

        System.out.println("");


        }


    public static void sortNotebookPrice(Notebook[] notebooks) {
        for (int i = 0; i < notebooks.length - 1; i++) {

            int min = i;
            int max = notebooks.length - 1 - i;

            for (int j = min + 1; j < notebooks.length; j++) {

                if (notebooks[j].getPrice() < notebooks[min].getPrice()) {
                    min = j;
                }
                if (notebooks[notebooks.length - j].getPrice() > notebooks[max].getPrice()) {
                    max = notebooks.length - j;
                }

            }

            int temp = notebooks[i].getPrice();
            notebooks[i].setPrice(notebooks[min].getPrice());
            notebooks[min].setPrice(temp);

            int temp2 = notebooks[notebooks.length - 1 - i].getPrice();
            notebooks[notebooks.length - 1 - i].setPrice(notebooks[max].getPrice());
            notebooks[max].setPrice(temp2);

        }
    }
    public static void sortNotebookRam(Notebook[] notebooks) {
        int k=0;
        boolean flag = false;
        for (int i = 0; i < notebooks.length - 1; i++) {

            if(notebooks[i].getPrice() == notebooks[i + 1].getPrice()) {
               k++;
               flag = true;
            }
            else if(flag){

                for (int m = i-k; m < i; m++) {

                    int min = m;
                    int max = i-m;

                    for (int j = min + 1; j < i; j++) {

                        if (notebooks[j].getRam() < notebooks[min].getRam()) {
                            min = j;
                        }
                        if (notebooks[i - j].getRam() > notebooks[max].getRam()) {
                            max = i + 1 - j;
                        }

                    }

                    int temp = notebooks[m].getRam();
                    notebooks[m].setRam(notebooks[min].getRam());
                    notebooks[min].setRam(temp);

                    int temp2 = notebooks[i - m].getRam();
                    notebooks[i - m].setRam(notebooks[max].getRam());
                    notebooks[max].setRam(temp2);

                }
                flag=false;
                k=0;

            }


        }
    }
    public static void sortNotebookModel(Notebook[] notebooks) {
        for (int i = 0; i < notebooks.length - 1; i++) {

            int min = i;
            int max = notebooks.length - 1 - i;

            for (int j = min + 1; j < notebooks.length; j++) {

                if (notebooks[j].getPrice() < notebooks[min].getPrice()) {
                    min = j;
                }
                if (notebooks[notebooks.length - j].getPrice() > notebooks[max].getPrice()) {
                    max = notebooks.length - j;
                }

            }

            int temp = notebooks[i].getPrice();
            notebooks[i].setPrice(notebooks[min].getPrice());
            notebooks[min].setPrice(temp);

            int temp2 = notebooks[notebooks.length - 1 - i].getPrice();
            notebooks[notebooks.length - 1 - i].setPrice(notebooks[max].getPrice());
            notebooks[max].setPrice(temp2);

        }
    }

}

