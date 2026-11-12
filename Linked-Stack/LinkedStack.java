import java.util.Scanner;

class LinkedStack {

    // Node inside LinkedStack
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    // Check empty stack
    boolean isEmpty() {
        return top == null;
    }

    // Add element
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

        System.out.println("Added: " + data);
    }

    // Remove top element
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println("Removed: " + top.data);
        top = top.next;
    }

    // Print elements
    void print() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        Node current = top;

        System.out.println("\nStack Elements:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

// Main Class