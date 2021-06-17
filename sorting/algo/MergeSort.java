package algo;

import abstracts.sorting;
import interfaces.*;

public class MergeSort extends sorting implements Isort {

    @Override
    public <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {
        splitdata(data, 0, data.length - 1);
    }

    public <T extends Comparable<? super T>> void splitdata(T[] data, int low, int high) {

        if (low < high) {
            int middle = (low + high) / 2;
            splitdata(data, low, middle);
            splitdata(data, middle + 1, high);
            mergedata(data, low, middle, high);
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Comparable<? super T>> void mergedata(T[] data, int low, int middle, int high) {
        T[] tmp = (T[]) new Comparable[data.length];
        int start = low, mid = middle + 1;
        int tmpit = low;

        while (start <= middle && mid <= high) {
            if (data[start].compareTo(data[mid]) >= 0) {
                tmp[tmpit] = data[mid];
                mid++;
                tmpit++;
            } else {
                tmp[tmpit] = data[start];
                start++;
                tmpit++;
            }
        }
        while (start <= middle) {
            tmp[tmpit] = data[start];
            start++;
            tmpit++;
        }
        while (mid <= high) {
            tmp[tmpit] = data[mid];
            mid++;
            tmpit++;
        }

        for (int l = low; l < tmpit; l++) {
            data[l] = tmp[l];
        }
    }
}
