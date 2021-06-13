package algo;

import abstracts.sorting;
import interfaces.Isort;

public class BubbleSort extends sorting implements Isort {

    @Override
    public <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {
        int length = data.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (is_Ascending) {
                    if (data[j].compareTo(data[j + 1]) > 0) {
                        swaping(data, j, j + 1);
                    }
                } else {
                    if (data[j].compareTo(data[j + 1]) < 0) {
                        swaping(data, j, j + 1);
                    }
                }
            }
        }

    }

}
