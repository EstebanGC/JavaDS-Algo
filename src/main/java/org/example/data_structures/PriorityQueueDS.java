package org.example.data_structures;

import java.util.*;

public class PriorityQueueDS {

    public void offerPQElement(Double priorityQueueElement) {
        Queue<Double> priorityQueue = new LinkedList<>();

        priorityQueue.offer(priorityQueueElement);

        System.out.println(priorityQueue);
    }
}
