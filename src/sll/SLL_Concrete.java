package sll;

public class SLL_Concrete<E> implements SLL<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SLL_Concrete() {
        head = null;
        tail = null;
        size = 0;
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
        Node<E> newNode = new Node<>(element, head);
        head = newNode;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (size == 0) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;

        /*
        if (isEmpty()) {
        addFirst(element);
        } else {
        Node<E> newNode = new Node<>(element, null);
        tail.setNext(newNode);
        tail = newNode;
        size++;
        }
         */
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty, nothing to return!");
        }
        E element = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return element;
    }

    //remove all elements until list is empty using removeFirst method
    @Override
    public void clear() {
        while (!isEmpty()) {
            removeFirst();
        }
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty, nothing to return!");
        }
        E element = tail.getElement();
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            tail.setNext(null);
        }
        size--;
        return element;
    }

    @Override
    public boolean contains(E element) {
        boolean contains = false;
        if (isEmpty()) {
            System.out.println("List is empty, nothing to return!");
        } else {
            Node<E> temp = head;
            while (!contains && temp != null) {
                if (temp.getElement().equals(element)) {
                    contains = true;
                }
                temp = temp.getNext();
            }
        }
        return contains;
    }

    @Override
    public void insertAtPosition(E element, int index) {
        if (index < 0 || index > size+1) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        } else if (index == size) {
            addLast(element);
            System.out.println("Added new element at the end of the list!");
        } else if (index == size+1) {
            addLast(element);
            System.out.println("Added new element at the end of the list!");
        } else if (index == 0) {
            addFirst(element);
            System.out.println("Added new element at the beginning of the list!");
        } else {
            Node<E> newNode = new Node<>(element, null);
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            System.out.println("Added new element at position " + index + "!");
            size++;
        }

    }

    @Override
    public String toString() {
        return "SLL_Concrete{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
