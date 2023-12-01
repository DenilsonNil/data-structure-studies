package br.com.kualit;

import java.util.Arrays;
import java.util.Objects;
public class ArrayList<T> {
    private static final int TOTAL_SIZE = 10;
    private int size;
    private Object[] itens;
    public ArrayList(){
        itens = new Object[TOTAL_SIZE];
    }
    public int getSize(){
        return this.size;
    }
    public void addItem(T item){
        if(size >= itens.length)
            increeseCapacity();
        itens[size++] = item;
    }
    private void increeseCapacity() {
        int newCapacity  = itens.length * 2;
        itens = Arrays.copyOf(itens, newCapacity);
    }
    public T getItemByIndex(int index){
        if((index < 0 || index > itens.length) || Objects.isNull((T) itens[index]))
            throw new ArrayIndexOutOfBoundsException("There is no item at this index. Invalid Index");
        return (T) itens[index];
    }
    public void printAllItems() {
        for(Object item : itens){
            if(Objects.nonNull(item))
                System.out.println(item);
        }
    }
    public T removeItem(int index) {
        T item = (T) itens[index];
        itens[index] = null;
        return item;
    }
}
