import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;

    public MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T item) {
        if (size == arr.length) {
            increase();
        }
        arr[size++] = item;
    }

    @Override
    public void add(T item, int index) {
        checkIndex(index);
        if (size == arr.length) {
            increase();
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = item;
        size++;
    }

    @Override
    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T removedElement = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        return removedElement;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        Arrays.sort(arr, 0, size);
    }

    @Override
    public void addAll() {

    }


    public void increase(){
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void checkIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public void addAll(T item) {
        T[] newArray = (T[]) new Object[arr.length];
        int index = 0;
        checkIndex(index);
        if (size == arr.length) {
            increase();
        }
        for (int i = size-1; i>= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index]=item;
        size++;
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }

}

