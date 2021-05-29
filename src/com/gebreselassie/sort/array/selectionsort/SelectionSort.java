package com.gebreselassie.sort.array.selectionsort;

public class SelectionSort {
    /*
    * find the largest element in the array and swap it with the element at the last index.
    * repeat the process until the first element is the smallest one.
    * start the first element as the largest one and compare it with the remaining elements to find the largest.
    * while doing so we keep the index of the largest element we found
    *
    *
    * In place algorith
    * O(n2)
    * Unstable
    */

    public static void selectionSort(int[] array){
        if(array == null || array.length <= 1)
            return;
        int lastIndex = array.length;

        for(int j = lastIndex; j > 0; j--){
            /*int largestElementIndex = 0;
            int largestElement = array[0];
            for(int i = 1; i < j; i++){
                if(array[i] > largestElement){
                    largestElement = array[i];
                    largestElementIndex = i;
                }
            }
            int temp = largestElement;
            array[largestElementIndex] = array[j - 1];
            array[j - 1] = temp;*/
            findMax(array, j);
        }
    }

    public static void findMax(int[] a, int lastIndex){
        int largestElementIndex = 0;
        int largestElement = a[0];
        for(int i = 1; i < lastIndex; i++){
            if(a[i] > largestElement){
                largestElement = a[i];
                largestElementIndex = i;
            }
        }
        swapElements(a, largestElementIndex, lastIndex, largestElement);
    }

    public static  void swapElements(int[] array, int lei, int li , int le){
        int temp = le;
        array[lei] = array[li - 1];
        array[li - 1] = temp;
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(array);
        for(int element : array)
            System.out.print(element + " ");
    }

}
