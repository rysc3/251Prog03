import java.util.Arrays;

// TODO: Implement ListInterface
public class ContiguousList<T> {
    // DO NOT EDIT CODE FROM HERE
    // Array backing the list
    private String[] elements;
    // Current number of elements in the array
    private int count;

    public ContiguousList() {
        elements = new String[10];
        count = 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }
    // TO HERE

    // TODO: Implement ListInterface methods
    // TODO: Implement toString and equals
}
