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
