package algo;

import abstracts.sorting;
import interfaces.Isort;

public class ShellSort extends sorting implements Isort {
    @Override
    public <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {
        int n = data.length;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i - gap; j >= 0; j = j - gap) {
                    if (data[j + gap].compareTo(data[j]) < 0)
                        swaping(data, j + gap, j);
                    else
                        break;
                }
            }

        }

    }

}
