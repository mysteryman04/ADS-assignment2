import java.util.NoSuchElementException;

public class LinkedListQueue<T> implements MyQueue {
    private MyLinkedList<T> list;
    public LinkedListQueue() {
        list = new MyLinkedList<>();
    }

    @Override
    public void enqueue(Object element) {
        list.add((T) element);
    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
