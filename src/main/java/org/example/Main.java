package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageProcessor messageProcessor = new MessageProcessor();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("==============================================");
            System.out.println("Menu:");
            System.out.println("1: Send Message");
            System.out.println("2: Show All Messages");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a message: ");
                    String userInput = scanner.nextLine();
                    Message userMessage = new Message(userInput);
                    messageProcessor.processMessage(userMessage);
                    break;
                case 2:
                    messageProcessor.displayAllMessages();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}


