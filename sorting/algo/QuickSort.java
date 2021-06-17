package algo;

import abstracts.sorting;
import interfaces.Isort;
import util.utility;

public class QuickSort extends sorting implements Isort {
    @Override
    public <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {
        quicksort(data, 0, data.length - 1);
    }

    public <T extends Comparable<? super T>> void quicksort(T[] data, int low, int high) {
        if (low < high) {
            int newlow = partition(data, low, high);
            quicksort(data, low, newlow - 1);
            quicksort(data, newlow + 1, high);
        }
    }

    public <T extends Comparable<? super T>> int partition(T[] data, int low, int high) {
        int pivot = low;
        int start = low;
        int end = high;
        while (start < end) {
            while (data[start].compareTo(data[pivot]) < 0) {
                start++;
            }
            while ((data[end].compareTo(data[pivot]) > 0)) {
                end--;
            }
            if (start < end) {
                swaping(data, start, end);
            }
        }
        swaping(data, low, end);
        return end;
    }
}
