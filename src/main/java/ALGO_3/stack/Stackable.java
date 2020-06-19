package ALGO_3.stack;

import java.util.Iterator;

public interface Stackable<T> extends Iterable<T>{
    void push(T data);

    T pop();

    T peek();

    boolean isEmpty();

    int size();

    void printAll();

    void clear();

}