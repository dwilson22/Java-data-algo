package com.danielwilson;

public class SelectionSort {
    private int[] array;

    SelectionSort(int[] a){
        array = a;
    }

    public void sort(){
        long startTime = System.nanoTime();

        print();
        for (int lastUnsortedIndex = array.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--){
            int largestIndex = 0;
             for(int i = 1; i <= lastUnsortedIndex; i++){
                 if(array[i] > array[largestIndex]){
                     largestIndex = i;

                 }
             }
             swap(array, largestIndex, lastUnsortedIndex);
        }


        print();
        long endTime = System.nanoTime();
        System.out.println("SelectionSort took " + (endTime - startTime) + " nanoseconds");
    }

    private void print(){
        String p = "";
        for (int i = 0 ; i < array.length; i ++){
            p = p + " " + array[i];
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
