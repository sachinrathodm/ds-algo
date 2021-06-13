package util;

public class utility {

    public static <T> void print(T[] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
