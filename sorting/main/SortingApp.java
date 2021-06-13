package main;

import javax.naming.ldap.SortResponseControl;

import abstracts.sorting;
import algo.BubbleSort;
import algo.SelectionSort;
import interfaces.Isort;
import util.utility;

public class SortingApp {
    public static void main(String[] args) {
        SortingApp sortingapp = new SortingApp();
        Integer[] data = new Integer[] { 10, 50, 90, 5, 3, -10 };
        sortingapp.sort(data, false);
        utility.print(data);
    }

    <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending) {
        // Isort sortapp = new BubbleSort();
        Isort sortapp = new SelectionSort();
        sortapp.sort(data, is_Ascending);

    }
}