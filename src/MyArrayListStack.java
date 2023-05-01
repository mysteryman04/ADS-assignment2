import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private MyArrayList<T> stackList;
    public MyArrayListStack() {
        stackList = new MyArrayList<>();
    }
    public void push(T item) {
        stackList.add(item);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

}
