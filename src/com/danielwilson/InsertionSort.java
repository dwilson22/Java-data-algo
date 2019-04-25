package com.danielwilson;

public class InsertionSort {
    private int[] array;

    InsertionSort(int[] a){
        array = a;
    }

    public void sort() {
        long startTime = System.nanoTime();
        print();

        for(int firstUnsorted = 1 ; firstUnsorted < array.length; firstUnsorted++){
            int insertion = array[firstUnsorted];

            int i;

            for(i = firstUnsorted; i > 0 && array[i-1] > insertion; i--){
                array[i] = array[i-1];
            }

            array[i] = insertion;
        }

        print();
        long endTime = System.nanoTime();
        System.out.println("InsertionSort took " + (endTime - startTime) + " nanoseconds");
    }

    private void print(){
        String p = "";
        for (int i = 0 ; i < array.length; i ++){
            p = p + " " + array[i];
        }
        System.out.println(p);

    }
}
