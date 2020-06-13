package ALGO_3.stack;

public interface Stackable<T> {
    void push(T data);

    T pop();

    T peek();

    boolean empty();

    int size();

    void printAll();

    void clear();
}