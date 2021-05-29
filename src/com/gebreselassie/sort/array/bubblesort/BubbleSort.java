package com.gebreselassie.sort.array.bubblesort;

public class BubbleSort {
    /*
    * array sorting algorithm
    * two options --> bubbling largest elements to the right or bubbling smallest elements to the left
    * In place algorithm
    * Quadrtic time complexity -> O(n2)
    * Algorithm degrades quickly
    */

    public static void bubbleSort(int[] array){
        if(array == null || array.length <= 1)
            return;
        int partitionIndex = array.length;

        for(int j = partitionIndex; j > 0; j--){
            for(int i = 0; i < partitionIndex - 1; i++){
                if(array[i] > array[i + 1]){
                    swapElements(array, i, i + 1);
                }
            }
        }
    }

    public static void swapElements(int[] array, int k, int l){
        int temp = array[k];
        array[k] = array[l];
        array[l] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4,3,2,1};
        int[] a = {1,2,4,3,0,-1};
        bubbleSort(array);
        bubbleSort(a);
        for(int element: array){
            System.out.print(element + " ");
        }
        System.out.println();
        for(int element: a){
            System.out.print(element + " ");
        }
    }

}
