package org.example.data_structures;

import java.util.Stack;

public class StackDS {

    public void pushElement(String stackElement) {
        Stack<String> stack = new Stack<String>();

        stack.push(stackElement);

        System.out.println("This is your stack: " + stack);

    }
}
