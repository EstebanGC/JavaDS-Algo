package org.example;
import org.example.data_structures.StackDS;

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

    }
}