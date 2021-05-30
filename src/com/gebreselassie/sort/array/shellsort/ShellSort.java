package com.gebreselassie.sort.array.shellsort;

public class ShellSort {
    /**
     * variation of insertion sort
     * Goal is to reduce the amount of shifting required
     * it uses gap value
     *
     * In place algorithm
     * O(n2) but it can perform better than this
     * unstable
     */

    public static void shellSort(int[] array){
        for(int gap = array.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < array.length; i++){
                int newElement = array[i];

                int j = i;

                while(j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 35, 15, -7, 60, -1, -22};
        shellSort(array);
        for(int element : array)
            System.out.print(element + " ");
    }

}
