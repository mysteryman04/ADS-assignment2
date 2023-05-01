import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private MyArrayList<T> stackList;
    public MyArrayListStack() {
        stackList = new MyArrayList<>();
    }
    public void push(T item) {
        stackList.add(item);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

}
