import java.util.NoSuchElementException;

public class MyLinkedList<T> implements MyList<T>{


    private class Node {
        T element;
        Node next;
        Node prev;

        public Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("Cannot remove from an empty list");
        }

        T removedElement = head.element;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedElement;
    }

    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException("Cannot get first element from an empty list");
        }
        return head.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(T element, int index) {
        checkIndex(index);
        Node newNode = new Node(element);

        if (index == 0) {
            if (size == 0) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                if (current == head) {
                    head = current.next;
                } else if (current == tail) {
                    tail = current.prev;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T removedElement = current.element;

        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        size--;

        return removedElement;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
            int index = size - 1;
            Node current = tail;
            while (current != null) {
                if (current.element.equals(o)) {
                    return index;
                }
                current = current.prev;
                index--;
            }
            return -1;
    }

    @Override
    public void sort() {
    }


    @Override
    public void addAll(T item) {

    }

    public void checkIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public void addAll() {

    }

}
