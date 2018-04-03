package com.thoughtworks.collection;

import java.util.LinkedList;

public class SingleLinkImpl<T> implements SingleLink<T>{


    LinkedList<T> linkedList = new LinkedList<>();

    @Override
    public T getHeaderData() {
        return linkedList.getFirst();
    }

    @Override
    public T getTailData() {
        return linkedList.getLast();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean deleteFirst() {
        return linkedList.removeFirst() != null;
    }

    @Override
    public boolean deleteLast() {
        return linkedList.removeLast() != null;
    }

    @Override
    public void addHeadPointer(T item) {
        linkedList.addFirst(item);
    }

    @Override
    public void addTailPointer(T item) {
        linkedList.addLast(item);
    }

    @Override
    public T getNode(int index) {
        return linkedList.get(index - 1);
    }
}