package br.com.kualit;

import java.util.Objects;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    private class Node<T> {
        private Node<T> next;
        private T data;
        public Node(T item) {
            this.data = item;
        }
    }
    public int getSize() {
        return size;
    }
    public void addElement(T item) {
        Node<T> newItem = new Node<>(item);
        if(first == null)
            first = newItem;
        else
            last.next = newItem;
        last = newItem;
        size++;
    }

    public T getItemByIndex(int index) {
        Node<T> actual = first;
        for(int i = 0; i < index; i++) {
            if(Objects.nonNull(actual.next))
                actual = actual.next;
            else
                throw new ArrayIndexOutOfBoundsException("There is no item at this index "  + index);
        }
        return actual.data;
    }
    public void printAllItems() {
        Node<T> actual = first;
        for (int i = 0; i < size; i++){
            System.out.println(actual.data);
            actual = actual.next;
        }
    }
}