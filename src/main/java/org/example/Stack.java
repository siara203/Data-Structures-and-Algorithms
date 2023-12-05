package org.example;

class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void displayAll() {
        Node<T> current = top;
        while (current != null) {
            System.out.println("Message All: " + current.data);
            current = current.next;
        }
    }
}
