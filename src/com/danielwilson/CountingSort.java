/*
 * Copyright 2019 BlueCat Networks. All rights reserved.
 */

package com.danielwilson;

public class CountingSort
{
	private int[] array;

	CountingSort(int[] a){
		array = a;
	}

	public void sort(){
		long startTime = System.nanoTime();
		print();
        CountingSort( array, 1,10 );
		print();
		long endTime = System.nanoTime();
		System.out.println("CountingSort took " + (endTime - startTime) + " nanoseconds");
	}

	private void print(){
		String p = "";
		for (int i = 0 ; i < array.length; i ++){
			p = p + " " + array[i];
		}
		System.out.println(p);

	}


	private static void CountingSort(int[] input, int min, int max){
		int[] countArray = new int[( max - min ) + 1];
		for (int i = 0 ; i < input.length; i++){
			countArray[input[i] - min]++;
		}


		int j = 0 ;

		for(int i = min; i <= max; i++){
			while(countArray[i-min] > 0){
				input[j++] = i;
				countArray[i - min]--;
			}
		}
	}
}
