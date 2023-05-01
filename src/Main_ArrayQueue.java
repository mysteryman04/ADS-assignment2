public class Main_ArrayQueue {
    public static void main(String[] args) {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Peeked element: " + queue.peek());

    }
}
