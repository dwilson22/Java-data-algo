package com.danielwilson;

public class Main {

    public static void main(String[] args) {
        int[] intBubbleSortArray = {-35, 20 , 45 , 100, 8, -55};
        int[] intSelectionSortArray = {-100, 20 , 45 , 1, 8, -5500};
        int[] intInsertionSortArray = {-1, 450 , 88 , -856, 200, -5};
        int[] intShellSortArray = {-1, 450 , 88 , -856, 200, -5};



        BubbleSort bubbleSort = new BubbleSort(intBubbleSortArray);
        bubbleSort.sort();
        SelectionSort selectionSort = new SelectionSort(intSelectionSortArray);
        selectionSort.sort();
        InsertionSort insertionSort = new InsertionSort(intInsertionSortArray);
        insertionSort.sort();
        ShellSort shellSort = new ShellSort(intShellSortArray);
        shellSort.sort();
    }
}
