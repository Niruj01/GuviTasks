package com.exception5;

import java.util.EmptyStackException;

public class Stack {
	
	    int maxSize;
	    int[] stackArray;
	    int top;

	    // Constructor
	    public Stack(int size) {
	        this.maxSize = size;
	        this.stackArray = new int[maxSize];
	        this.top = -1;
	    }

	    // Function to push elements onto the stack
	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack is full. Cannot push element onto the stack.");
	        } else {
	            stackArray[++top] = element;
	            System.out.println("Pushed element: " + element);
	        }
	    }

	    // Function to pop elements from the stack
	    public int pop() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        } else {
	            int poppedElement = stackArray[top--];
	            System.out.println("Popped element: " + poppedElement);
	            return poppedElement;
	        }
	    }

	    // Function to check if the stack is empty
	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    // Function to check if the stack is full
	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }

	    // Function to get the top element of the stack without popping it
	    public int peek() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        } else {
	            return stackArray[top];
	        }
	    }

	    // Function to get the size of the stack
	    public int size() {
	        return top + 1;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Stack stack = new Stack(5);

	        System.out.println("Is the stack empty? " + stack.isEmpty());

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Is the stack empty? " + stack.isEmpty());
	        System.out.println("Stack size: " + stack.size());

	        System.out.println("Top element of the stack: " + stack.peek());

	        stack.pop();
	        stack.pop();
	        stack.pop();

	        System.out.println("Is the stack empty? " + stack.isEmpty());
	    }

}
