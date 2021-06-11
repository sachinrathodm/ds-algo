package util;

public class utility {

    public static <T> void print(T[] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("\n");
    }

}
