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
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
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
