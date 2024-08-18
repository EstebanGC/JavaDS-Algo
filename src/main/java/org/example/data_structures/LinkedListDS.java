package org.example.data_structures;

import java.util.*;
import java.util.Stack;

public class LinkedListDS {
    public void addElement (String linkedListelement) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");

        linkedList.pop();

        System.out.println("This is your linked list: " + linkedList + linkedList.size());
    }
}
