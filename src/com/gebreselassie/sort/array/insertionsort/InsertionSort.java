package com.gebreselassie.sort.array.insertionsort;

public class InsertionSort {
    /*
    * In place algorithm
    * O(n2)
    * stable algorithm
    *
    * Start from i = 1 check it if it is <= the previous element. if so swap them.
    * then increment i by 1 and repeat until you reach the element at index = 0.
    *
    */

    // my approach
    public static void insertionSort(int[] array){
        if(array == null || array.length <= 1)
            return;
        for(int i = 1; i < array.length; i++){
            int newElement = array[i];
            // to keep track of indexes to the left of the array
            int k = i;
            for(int j = k - 1; j >= 0; j--){
                //to swap the current element with the previous element
                if(newElement < array[j]){
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                    // to keep track of the index of the current new element
                    k = j;
                }
                newElement = array[k];
            }
        }
    }

    // another approach
    public static void inSert(int[] array){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--){
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(array);
        for(int element : array)
            System.out.print(element + " ");

        System.out.println();

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        inSert(arr);
        for(int element : arr)
            System.out.print(element + " ");
    }
}
