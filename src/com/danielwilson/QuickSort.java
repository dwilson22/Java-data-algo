package com.danielwilson;

public class QuickSort {
    private int[] array;

    QuickSort(int[] a){
        array = a;
    }

    private void print(){
        String p = "";
        for (int i = 0 ; i < array.length; i ++){
            p = p + " " + array[i];
        }
        System.out.println(p);

    }

    public void sort(){
        long startTime = System.nanoTime();

        print();
        QuickSort( array, 0, array.length );
        print();
        long endTime = System.nanoTime();
        System.out.println("MergeSort took " + (endTime - startTime) + " nanoseconds");
    }

    private static void QuickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        QuickSort(input, start, pivotIndex);
        QuickSort(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){
            //used for traversal
            while (i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }

            while(i<j &&input[++i] <= pivot);
            if(i > j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
