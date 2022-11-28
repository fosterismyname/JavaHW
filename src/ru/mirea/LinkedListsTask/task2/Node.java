package ru.mirea.LinkedListsTask.task2;
//yzel
public class Node<T> {
    public T data;

    public Node<T> next;
    public Node<T> prev;

    public Node() {
        next = null;
        prev = null;
        data = null;
    }

    public void displayNodeData() {
        System.out.print(data + " <-> ");
    }
}
