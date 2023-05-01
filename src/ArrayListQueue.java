import java.util.NoSuchElementException;
public class ArrayListQueue<T> implements MyQueue{
    private MyArrayList<T> list;

    public ArrayListQueue() {
        list = new MyArrayList<>();
    }
    @Override
    public void enqueue(Object element) {
        list.add((T) element);
    }

    @Override
    public Object dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.remove(0);
    }

    @Override
    public T peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
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
