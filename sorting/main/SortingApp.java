package main;

import algo.InsertionSort;
import algo.MergeSort;
import algo.QuickSort;
import interfaces.Isort;
import util.utility;

public class SortingApp {
    public static void main(String[] args) {
        SortingApp sortingapp = new SortingApp();
        Integer[] data = new Integer[] { 5, 50, 1, 90, 3, -10 };
        utility.print(data);
        sortingapp.sort(data, false);
        utility.print(data);
    }

    <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {
        // Isort sortapp = new BubbleSort();
        // Isort sortapp = new SelectionSort();
        // Isort sortapp = new InsertionSort();
        // Isort sortapp = new MergeSort();
        Isort sortapp = new QuickSort();
        sortapp.sort(data, is_Ascending);

    }
}