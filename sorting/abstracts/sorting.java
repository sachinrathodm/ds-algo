package abstracts;

/**
 * sorting
 */
public abstract class sorting {

    public <T> void swaping(T[] data, int firstValue, int SecondValue) {
        T temp = data[firstValue];
        data[firstValue] = data[SecondValue];
        data[SecondValue] = temp;
    }

}