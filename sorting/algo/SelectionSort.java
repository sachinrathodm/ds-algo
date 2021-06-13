package algo;

import abstracts.sorting;
import interfaces.Isort;

public class SelectionSort extends sorting implements Isort {

    @Override
    public <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {

        for (int i = 0; i < data.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < data.length; j++) {
                if (is_Ascending) {
                    if (data[tmp].compareTo(data[j]) > 0) {
                        tmp = j;
                    }
                } else {
                    if (data[tmp].compareTo(data[j]) < 0) {
                        tmp = j;
                    }
                }
            }
            swaping(data, tmp, i);
        }

    }

}
