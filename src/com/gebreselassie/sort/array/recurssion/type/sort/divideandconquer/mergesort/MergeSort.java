package com.gebreselassie.sort.array.recurssion.type.sort.divideandconquer.mergesort;

public class MergeSort {
    /*
    * divide and conquer algorithm
    * recursive algorithm
    * two phases. splitting and merging
    *
    * O(nlogn)
    * Stable
    *
    * split the array into two arrays. left and right array
    * keep splitting until all the arrays have only one element each - these arrays are sorted.
    * Splitting phase is in place which means consumes no memory
    *
    * Then merge. It means when merging we are sorting.
    * Merging- Not in place algorithm - it uses temporary arrays which means it uses memory
    */

    public static void mergeSort(int[] array, int start, int end){
        // for an arraya with only one lement
        if(end - start < 2){
            return;
        }
        int mid = (end + start) / 2;
        //for left array
        mergeSort(array, start, mid);
        // for right array
        mergeSort(array, mid, end);
        // For merging the arrays
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        // array[mid - 1] is last element of the already sorted left array
        // array[mid] is the first element of the already sorted right array
        if(array[mid - 1] <= array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIdex = 0;
        // temporary array to hold elements
        int[] temp = new int[end - start];

        while( i < mid && j < end){
            temp[tempIdex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIdex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIdex);
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 6, -1, 0};
        mergeSort(array, 0, array.length);
        for(int element : array)
            System.out.print(element + " ");
    }
}
