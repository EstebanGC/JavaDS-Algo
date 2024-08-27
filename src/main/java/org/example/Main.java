package org.example;
import org.example.data_structures.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Stack
        Scanner stackScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the stack: ");
        String stackElement = stackScanner.nextLine();
        StackDS stackDS = new StackDS();
        stackDS.pushElement(stackElement);

        System.out.println(stackDS);

        //Queue
        Scanner queueScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the queue: ");
        Integer queueElement = queueScanner.nextInt();
        QueueDS queueDS = new QueueDS();
        queueDS.offerElement(queueElement);

        System.out.println(queueDS);

        //Priority Queue
        Scanner priorityQueueScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the priority queue: ");
        Double priorityQueueElement = priorityQueueScanner.nextDouble();
        PriorityQueueDS priorityQueueDS = new PriorityQueueDS();
        priorityQueueDS.offerPQElement(priorityQueueElement);

        System.out.println(priorityQueueDS);

        //Linked List
        Scanner linkedListScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the linked list: ");
        String linkedListElement = linkedListScanner.nextLine();
        LinkedListDS linkedListDS = new LinkedListDS();
        linkedListDS.addElement(linkedListElement);

        System.out.println(linkedListDS);

        //Dinamic Array
        Scanner dinamicArrayScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the dinamic array: ");

        String dinamicArrayElement = dinamicArrayScanner.nextLine();
        DinamicArrayDS dinamicArrayDS = new DinamicArrayDS();
        dinamicArrayDS.addDinArr(dinamicArrayElement);

        System.out.println(dinamicArrayDS);

        //LinkedList vs ArrayList
        LLvAL llvAL = new LLvAL();
        llvAL.time();
        System.out.println(llvAL);
        System.out.println("I'm tired today :( ");
    }
}