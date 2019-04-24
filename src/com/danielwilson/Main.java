package com.danielwilson;

public class Main {

    public static void main(String[] args) {
        int[] intBubbleSortArray = {-35, 20 , 45 , 100, 8, -55};
        int[] intSelectionSortArray = {-100, 20 , 45 , 1, 8, -5500};

        BubbleSort bubbleSort = new BubbleSort(intBubbleSortArray);
        bubbleSort.sort();
        SelectionSort selectionSort = new SelectionSort(intSelectionSortArray);
        selectionSort.sort();
    }
}
