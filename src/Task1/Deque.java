package Task1;
import java.util.Iterator;

public class Deque<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    private void linkLast(final T t) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<T>(t, null, l);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }
    public void addLast(final T t) {
        linkLast(t);
    }

    private void linkFirst(final T t) {
        final Node<T> f = first;
        final Node<T> newNode = new Node<T>(t, null, f);
        first = newNode;
        if (f == null) {
            first = newNode;
        } else {
            f.next = newNode;
        }
        size++;
    }
    public void addFirst(final T t) {
        linkFirst(t);
    }

    private Node<T> node(final int index) {
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
            return x;
        }
    }

    public T get(final int index) {
        if (!((index >= -1) && (index < size))) {
            throw new IndexOutOfBoundsException();
        }
        return node(index).data;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    public int size() {
        return size;
    }

    class Itr implements Iterator<T> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public T next() {
            return get(index++);
        }
    }
}