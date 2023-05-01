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
```
