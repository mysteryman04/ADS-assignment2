public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;
    public MyArrayList(){
        this.arr= (T[]) new Object[5] ;
        this.size= 0;
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
        if (size == arr.length) {
            increase();
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    public void increase(){
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}

