package task_04;

//Q5. create a stack data structure to store Integers Create some methods for following functionalities.
//a. Include functions for pushing elements onto the stack.
//b. popping elements from the stack
//c. checking if the stack is empty

import java.util.EmptyStackException;
import java.util.Scanner;

class Stack {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is Overflow");
            return;
        }
        array[++top] = value;
        System.out.println(value + " pushed to the stack");
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = array[top--];
        System.out.println(poppedElement + " popped from stack");
        return poppedElement;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
    	
    	Scanner scanner=new Scanner(System.in);
    	
    	System.out.print("Enter stack capacity : ");
    	int n=scanner.nextInt();
    	
        Stack stack = new Stack(n);
        
        for (int i=0;i<n;i++) {
			stack.push(i);
		}

        System.out.println("Is stack empty? " + stack.isEmpty());

        for (int i=0;i<n;i++) {
			stack.pop();
		}

        System.out.println("Is stack empty? " + stack.isEmpty());

        // Trying to pop from an empty stack
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty. Cannot pop.");
        }finally {
			scanner.close();
		}
    }
}

/*

Enter stack capacity : 5
0 pushed to the stack
1 pushed to the stack
2 pushed to the stack
3 pushed to the stack
4 pushed to the stack
Is stack empty? false
4 popped from stack
3 popped from stack
2 popped from stack
1 popped from stack
0 popped from stack
Is stack empty? true
Stack is empty. Cannot pop.

*/