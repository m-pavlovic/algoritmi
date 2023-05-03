package cll;

import sll.Node;
import sll.SLL;

public class CLL<E> implements SLL<E> {

    private Node<E> tail;
    private int size;

    public CLL() {
        tail = null;
        size = 0;
        System.out.println("Circular Linked List initialized");
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(E element) {
        if (isEmpty()) {
            System.out.println("Adding element at first position in the list");
            tail = new Node<>(element, null);
            tail.setNext(tail);
            size++;
        } else {
            System.out.println("Adding element at the beginning");
            Node<E> newNode = new Node(element, tail.getNext());
            tail.setNext(newNode);
            size++;
        }

    }

    @Override
    public void addLast(E element) {
        if (isEmpty()) {
            System.out.println("Adding element at last position in the list");
            tail = new Node<>(element, null);
            tail.setNext(tail);
            size++;
        } else {
            addFirst(element);
            System.out.println("Using addFirst to implement addLast");
            tail = tail.getNext();
        }

    }

    @Override
    public E removeFirst() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node<E> first = tail.getNext();
            tail.setNext(first.getNext());
            first.setNext(null);
            element = first.getElement();
            System.out.println("Removed first element: " + element);
            size--;
        }
        return element;
    }

    @Override
    public void clear() {

    }

    @Override
    public E removeLast() {
        return null;
    }

    /**
     * Method that checks if the list contains the element
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        boolean found = false;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node<E> current = tail.getNext();
            while (current != tail) {
                if (current.getElement().equals(element)) {
                    found = true;
                    break;
                }
                current = current.getNext();
            }
            if (current.getElement().equals(element)) {
                found = true;
            }
        }
        return found;
    }

    @Override
    public void insertAtPosition(Object element, int index) {

    }

    @Override
    public String toString() {
        return "CLL{" +
                "tail=" + tail.getElement() +
                ", size=" + size +
                '}';
    }

    /**
     * Method that rotates tail to the next node
     */
    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
            System.out.println("Tail rotated to next node");
        } else {
            System.out.println("List is empty");
        }
    }

    public E getFirst() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            element = tail.getNext().getElement();
        }
        return element;
    }
}
