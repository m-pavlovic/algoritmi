package sll;

public interface SLL<E> {
    /**
     * return the number of elements in the list
     * that is number of actual elements in the list
     * @return size of the list
     */
    int size();

    /**
     * return if list is empty
     * true if empty, false otherwise
     * @return empty or not
     */
    boolean isEmpty();

    /**
     * add new element at the beginning of the list
     */
    void addFirst(E element);

    /**
     * add new element at the end of the list
     */
    void addLast(E element);

    /**
     * removing first element from the list
     * list size is reduced by 1
     * @return element from first position
     */
    E removeFirst();

    /**
     * remove all elements until list is empty
     * list size is reduced to 0
     */
    void clear();

    /**
     * remove last element from the list
     * list size is reduced by 1
     * @return element from last position, null if list is empty
     */
    E removeLast();

    /**
     * @return true if contains element, false otherwise
     */
    boolean contains(E element);

    /**
     * insert element at desired position
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    void insertAtPosition(E element, int index);
}
