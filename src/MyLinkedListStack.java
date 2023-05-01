import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private MyLinkedList<T> stackList;

    public MyLinkedListStack() {
        stackList = new MyLinkedList<>();
    }
    public void push(T item) {
        stackList.addFirst(item);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.removeFirst();
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}
