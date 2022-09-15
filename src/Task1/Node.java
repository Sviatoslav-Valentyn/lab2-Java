package Task1;
public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> previous;

    Node(final T data, final Node<T> next, final Node<T> previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}