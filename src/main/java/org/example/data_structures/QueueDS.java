package org.example.data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

    public void offerElement(Integer element2) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(element2);

        System.out.println("This is your queue: " + queue);
    }




}
