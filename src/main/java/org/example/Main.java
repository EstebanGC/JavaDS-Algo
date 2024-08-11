package org.example;
import org.example.data_structures.QueueDS;
import org.example.data_structures.StackDS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the stack: ");
        String element = scanner.nextLine();
        StackDS stackDS = new StackDS();
        stackDS.pushElement(element);

        System.out.println(stackDS);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the element you want to add to the queue: ");
        Integer element2 = scanner2.nextInt();
        QueueDS queueDS = new QueueDS();
        queueDS.offerElement(element2);

        System.out.println(queueDS);
    }
}