package org.Study.Mar.s20.stackByLinkedList;
import java.util.EmptyStackException;
public class StackLinkedList <T>{

    private Node<T> top;
    private int size;
    public StackLinkedList() {
        top = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public T peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getItem();
    }
    public void push(T item) {
        Node newNode = new Node(item, top);
        top = newNode;
        size++;
    }
    public T pop() {
        if(isEmpty()) {
            throw  new EmptyStackException();
        }
        T topItem = top.getItem();
        top = top.getNext();
        size--;
        return topItem;
    }
}
