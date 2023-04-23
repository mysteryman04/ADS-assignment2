# ADS-assignment2


The provided code implements two data structures - an ArrayList and a LinkedList - that both implement the same interface MyList<T>. The interface defines methods that are common to both data structures, such as add(T element), remove(Object o), clear(), get(int index), and size(). The MyArrayList uses an array to store its elements, while the MyLinkedList uses a linked list.

The MyArrayList implementation initializes its internal array with a length of 5 and increases its capacity by doubling its size when needed. When adding an element, the implementation checks whether the array is full and increases its capacity if necessary before adding the element. When removing an element, the implementation shifts all subsequent elements one position to the left to fill the gap. The indexOf and lastIndexOf methods perform linear searches through the array to find the first or last occurrence of a specified object.

The MyLinkedList implementation uses a doubly-linked list to store its elements. When adding an element, the implementation creates a new node and sets it as the tail of the list. When adding an element at a specific index, the implementation finds the node at the specified index and inserts the new node before it. When removing an element, the implementation finds the node containing the element and updates the links of its predecessor and successor to skip over it. The indexOf and lastIndexOf methods perform linear searches through the linked list to find the first or last occurrence of a specified object.

Both implementations provide the contains method to check whether a specified object is present in the data structure. They also implement the checkIndex method to ensure that an index is valid before accessing an element at that index. Finally, the MyArrayList implementation provides the sort method to sort the elements in the array using the Arrays.sort method.

@Override
public void sort() {
// Not implemented for MyLinkedList
}

arduino
Copy code
public void checkIndex(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException();
    }
}
}

Both implementations have similar functionalities but with different underlying data structures. MyArrayList uses an array to store elements, while MyLinkedList uses a doubly linked list.

MyArrayList has a fixed capacity, which can be increased dynamically using the increase method when the current size is equal to the length of the array. MyLinkedList has no fixed capacity and can grow dynamically as elements are added.

The add method for MyArrayList appends the new element to the end of the array and increases the size. If the current size is equal to the length of the array, the array's capacity is doubled. The add method for MyLinkedList adds the new element to a specific index in the list, adjusting the references of the nodes before and after the new node. If the index is at the beginning or end of the list, special cases are handled accordingly.

The remove method for MyArrayList removes the element at a specific index, shifting all the subsequent elements one position to the left and decreasing the size. The remove method for MyLinkedList removes the node with the specified element, adjusting the references of the nodes before and after the removed node.

MyArrayList provides an implementation for the sort method using the built-in Arrays.sort method. MyLinkedList does not provide an implementation for this method.

In summary, the choice between using an ArrayList or a LinkedList depends on the specific requirements of the use case. ArrayLists are more efficient for random access, while LinkedLists are more efficient for frequent insertions and deletions.
