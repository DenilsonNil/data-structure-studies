package br.com.kualit;

import br.com.kualit.datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addElement("Café");
        ll.addElement("Banana");
        ll.addElement("Chocolate");
        ll.addElement("Sorvete");

        ll.printAllItems();
    }
}