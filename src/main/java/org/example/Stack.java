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
        StringBuilder message = new StringBuilder("Message All: ");
        while (current != null) {
            message.append(current.data).append(", ");
            current = current.next;
        }
        if (message.length() > "Message All: ".length()) {
            message.delete(message.length() - 2, message.length());
        }
        System.out.println(message.toString());
    }

}
