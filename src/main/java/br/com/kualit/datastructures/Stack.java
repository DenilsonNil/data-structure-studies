package br.com.kualit.datastructures;

import java.util.EmptyStackException;

public class Stack<T> {
    private int size;
    private Node<T> top;
    private class Node<T> {
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(T item) {
        Node<T> newItem = new Node<>(item);
        newItem.next = top;
        top = newItem;
        size++;
    }

    public T pop() {
        if(isEmpty())
            throw new EmptyStackException();
        T popedValue = top.data;
        top = top.next;
        size--;
        return popedValue;
    }
    public T top() {
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }
    private boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
