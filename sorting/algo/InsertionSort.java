package algo;

import abstracts.sorting;
import interfaces.Isort;

public class InsertionSort extends sorting implements Isort {

    @Override
    public <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {

        for (int i = 1; i < data.length; i++) {
            T temp = data[i];
            int j = i;
            while (j >= 1 && temp.compareTo(data[j - 1]) < 0) {
                swaping(data, j, j - 1);
                j--;
            }
            // data[i] = temp;
        }

    }

}
