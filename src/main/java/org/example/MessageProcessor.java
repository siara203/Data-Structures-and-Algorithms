package org.example;

class MessageProcessor {
    private Queue<Message> messageQueue;
    private Stack<Message> messageStack;

    public MessageProcessor() {
        this.messageQueue = new Queue<>();
        this.messageStack = new Stack<>();
    }

    public void processMessage(Message message) {
        if (isValid(message)) {
            enqueueValidMessage(message);
        } else {
            displayError("Invalid Message. Please enter a message with length between 1 and 250 characters.");
        }
    }

    public void displayAllMessages() {
        messageStack.displayAll();
    }

    private boolean isValid(Message message) {
        if (message.getContent().trim().isEmpty()) {
            return false;
        }

        if (message.getContent().length() > 250) {
            return false;
        }

        return true;
    }

    private void enqueueValidMessage(Message message) {
        messageQueue.enqueue(message);

        displayMessage(message.getContent());

        while (!messageQueue.isEmpty()) {
            Message dequeuedMessage = messageQueue.dequeue();
            messageStack.push(dequeuedMessage);
        }
    }

    private void displayError(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }

    private void displayMessage(String messageContent) {
        System.out.println("Message: " + messageContent);
    }
}
