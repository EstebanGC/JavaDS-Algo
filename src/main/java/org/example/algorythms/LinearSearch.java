package org.example.algorythms;

public class LinearSearch {
    public void findIndex(){
        int[] array = {9,1, 2,3,4,8,6};

        int index = linearSearch(array,1);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value){

        for (int i = 0; i < array.length; i++) {
            if(array[i]== value){
                return i;
            }
        }
        return -1;
    }
}
