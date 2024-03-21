package org.Study.Mar.s20.stackByLinkedList;

public class Node <T>{
    private T item;
    private Node<T> next;
    public Node(T newItem, Node<T> node) {
        item = newItem;
        next = node;
    }
    //get과 set 메소드들
    public T getItem() { return item; }
    public Node<T> getNext() { return next; }

    public void setItem(T item) {
        this.item = item;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
