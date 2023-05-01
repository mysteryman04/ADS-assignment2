import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private MyLinkedList<T> stackList;

    public MyLinkedListStack() {
        stackList = new MyLinkedList<>();
    }
    public void push(T item) {
        stackList.addFirst(item);
    }

}
