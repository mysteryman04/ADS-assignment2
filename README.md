# ADS-assignment2


```java
 * A simple implementation of a queue using a MyArrayList.
 * Allows elements to be added to the back of the queue and removed from the front.
 * Provides methods to check if the queue is empty, get the size of the queue,
 * and peek at the front element of the queue without removing it.
 *
 * @param <E> the type of elements in the queue
 */
public class MyArrayListQueue<E> {

    private MyArrayList<E> list;

    /**
     * Constructs an empty queue.
     */
    public MyArrayListQueue() {
        list = new MyArrayList<E>();
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element the element to add to the queue
     */
    public void enqueue(E element) {
        list.add(element);
    }

    /**
     * Removes and returns the front element of the queue.
     * Throws NoSuchElementException if the queue is empty.
     *
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.remove(0);
    }

    /**
     * Returns the front element of the queue without removing it.
     * Throws NoSuchElementException if the queue is empty.
     *
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
    }

    /**
     * Returns true if the queue is empty or false if it is not.
     *
     * @return true if the queue is empty or false if it is not
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }

}


/**
 * Implementation of a stack using an ArrayList as the underlying data structure.
 * @param <T> the type of elements held in this stack
 */
public class MyArrayListStack<T> {

    private MyArrayList<T> list;

    /**
     * Creates a new MyArrayListStack.
     */
    public MyArrayListStack() {
        list = new MyArrayList<>();
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param element the element to push onto the stack
     */
    public void push(T element) {
        list.add(element);
    }

    /**
     * Removes and returns the top element of the stack.
     * @return the top element of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return the top element of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements in the stack
     */
    public int size() {
        return list.size();
    }

}
```
