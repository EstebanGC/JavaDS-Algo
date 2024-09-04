package org.example.algorythms;

import java.util.Arrays;

public class LinearSearch {
    public void whatever() {
        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);

        if(index >= 0) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at index " + index );
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        return -1;
    }
}
