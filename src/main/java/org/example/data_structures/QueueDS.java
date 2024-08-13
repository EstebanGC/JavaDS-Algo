package org.example.data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

    public void offerElement(Integer queueElement) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(queueElement);

        queue.poll();

        System.out.println("This is your queue: " + queue);
    }




}
