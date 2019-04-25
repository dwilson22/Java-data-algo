package com.danielwilson;

public class ShellSort {
    private int[] array;

    ShellSort(int[] a){
        array = a;
    }

    public void sort(){
        long startTime = System.nanoTime();
        print();

        for(int gap = array.length/2; gap  > 0; gap /= 2){
            for(int i = gap; i < array.length; i++){
                int insertion = array[i];
                int j = i;

                while(j >= gap && array[j - gap] > insertion){
                    array[j] = array[j-gap];
                    j -= gap;
                }

                array[j] = insertion;
            }
        }

        print();
        long endTime = System.nanoTime();
        System.out.println("ShellSort took " + (endTime - startTime) + " nanoseconds");
    }

    private void print(){
        String p = "";
        for (int i = 0 ; i < array.length; i ++){
            p = p + " " + array[i];
        }
        System.out.println(p);

    }
}
