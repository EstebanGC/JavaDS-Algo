package org.example;
import org.example.data_structures.PriorityQueueDS;
import org.example.data_structures.QueueDS;
import org.example.data_structures.StackDS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stackScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the stack: ");
        String stackElement = stackScanner.nextLine();
        StackDS stackDS = new StackDS();
        stackDS.pushElement(stackElement);

        //------------------------------

        System.out.println(stackDS);

        Scanner queueScanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the queue: ");
        Integer queueElement = queueScanner.nextInt();
        QueueDS queueDS = new QueueDS();
        queueDS.offerElement(queueElement);

        System.out.println(queueDS);

        //------------------------------

        Scanner priorityQueueElement = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the priority queue: ");
        Double priorityElement = priorityQueueElement.nextDouble();
        PriorityQueueDS priorityQueueDS = new PriorityQueueDS();
        priorityQueueDS.offerPQElement(priorityElement);

        System.out.println(priorityQueueDS);
    }
}