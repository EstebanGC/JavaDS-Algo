package org.example.data_structures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLvAL {

    public void time() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        //LinkedList
        startTime = System.nanoTime();
        linkedList.get(0);
        //do something
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList Elapsed Time: " + elapsedTime + " ns");

        //
        startTime = System.nanoTime();
        arrayList.get(0);
        //do something
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList Elapsed Time: " + elapsedTime + " ns");
    }
}
