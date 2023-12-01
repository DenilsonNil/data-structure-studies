package br.com.kualit.datastructures;

import java.util.NoSuchElementException;

public class Queue<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;
    private class Node<T> {
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void queue(T item) {
        Node<T> newItem = new Node<>(item);
        if(isEmpty())
            first = newItem;
        else
            last.next = newItem;

        last = newItem;
        size++;
    }

    public T enqueue() {
        if(isEmpty())
            throw new NoSuchElementException("Empty queue");
        T enqueedValue = first.data;

        first = first.next;

        if(first == null)
            last = null;
        size--;
        return enqueedValue;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
