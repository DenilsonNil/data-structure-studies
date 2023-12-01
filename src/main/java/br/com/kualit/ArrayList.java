package br.com.kualit;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList<T> {
    private static final int TOTAL_SIZE = 10;
    private int size;
    private Object[] elements;


    public ArrayList(){
        elements = new Object[TOTAL_SIZE];
    }

    public int getSize(){
        return this.size;
    }

    public void addItem(T element){
        if(size >= elements.length)
            increeseCapacity();
        elements[size] = element;
        size++;
    }
    private void increeseCapacity() {
        int newCapacity  = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    public T getItemByIndex(int index){
        if((index < 0 || index > elements.length) || Objects.isNull((T) elements[index]))
            throw new ArrayIndexOutOfBoundsException("There is no element at this index. Invalid Index");
        return (T) elements[index];
    }
    public void printElements() {
        for(Object element : elements){
            if(Objects.nonNull(element))
                System.out.println(element);
        }
    }
    public T removeItem(int index) {
        T element = (T) elements[index];
        elements[index] = null;
        return element;
    }
}
