package interfaces;

public interface Isort {
    <T extends Comparable<? super T>> void sort(T[] data, boolean is_Ascending);
}
