package com.danielwilson;

public class BubbleSort {
    private int[] intArray;

    BubbleSort(int[] array){
        intArray = array;
    }

    public void sort(){
        long startTime = System.nanoTime();

        print();
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }
        print();
        long endTime = System.nanoTime();
        System.out.println("BubbleSort took " + (endTime - startTime) + " nanoseconds");

    }

    private void print(){
        String p = "";
        for (int i = 0 ; i < intArray.length; i ++){
            p = p + " " + intArray[i];
        }
        System.out.println(p);

    }


    private void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
