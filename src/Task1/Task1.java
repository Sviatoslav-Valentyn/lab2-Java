package Task1;
import java.util.NoSuchElementException;

public class Task1 {
    public static<T> void Iterable(final Iterable<T> iterable) {
        for(final T element : iterable) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(final String[] args) {
        final Deque<String> deque = new Deque<String>();
        System.out.println("Add 2 elements: ");

        deque.addLast("test2");
        deque.addLast("test3");
        Iterable(deque);

        System.out.println("Add one first element: ");
        deque.addFirst("test1");
        Iterable(deque);
    }
}
