package org.example.data_structures;

import org.example.data_structures.*;

import java.util.Stack;

public class StackDS {

    public void pushElement(String element) {
        Stack<String> stack = new Stack<String>();

        stack.push(element);

        System.out.println("This is your stack: " + stack);

    }
}
