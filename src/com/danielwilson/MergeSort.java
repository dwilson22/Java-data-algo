package com.danielwilson;

public class MergeSort {
    private int[] array;

    MergeSort(int[] a){
        array = a;
    }

    public void sort(){
        long startTime = System.nanoTime();
        print();

        mergeSort(array, 0 , array.length);

        print();
        long endTime = System.nanoTime();
        System.out.println("MergeSort took " + (endTime - startTime) + " nanoseconds");
    }

    private void print(){
        String p = "";
        for (int i = 0 ; i < array.length; i ++){
            p = p + " " + array[i];
        }
        System.out.println(p);

    }


    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int mid = (end + start) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input,i, input, start+ tempIndex, mid - i);
        System.arraycopy(tempArray, 0 ,input, start, tempIndex);

    }
}
