package br.com.kualit.algorithms;

public class Math {

    public int calculateFibonacci(int num) {
        return num <= 1 ? num : calculateFibonacci(num - 2) + calculateFibonacci(num -1);
    }

    public int fatorial(int num) {
        return num == 1 || num == 0 ?  1 : fatorial(num -  1) * num;
    }
}
